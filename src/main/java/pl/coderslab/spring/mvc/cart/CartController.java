package pl.coderslab.spring.mvc.cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Controller
@RequestMapping("/cart")
public class CartController {

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping
    public String showForm() {
        return "welcomePage";
    }

    @PostMapping("/add")
    @ResponseBody
    public String addToCart(@RequestParam(defaultValue = "produkt") String name,
                            @RequestParam(defaultValue = "0.01") double price,
                            @RequestParam(defaultValue = "1") int quantity) {

        CartItem itemToAdd = cart.getCart()
                .stream()
                .filter(cartItem -> cartItem.getProduct().getName().equals(name))
                .findAny()
                .orElse(new CartItem(new Product(name, price), quantity));

        Predicate<CartItem> isQualified = (s -> s.getProduct().getName().equals(itemToAdd.getProduct().getName()));

        boolean itemExist = cart.getCart().stream().anyMatch(isQualified);

        if (itemExist) itemToAdd.setQuantity(itemToAdd.getQuantity() + quantity);
        else cart.addToCart(itemToAdd);

        return "Item added";

    }

    @GetMapping("/remove")
    @ResponseBody
    public String removeItem(@RequestParam String itemName) {

        Optional<CartItem> toRemove = cart.getCart().stream()
                .filter(cartItem -> cartItem.getProduct().getName().equals(itemName))
                .findFirst();

        CartItem cartItem = toRemove.get();
        cart.removeFromCart(cartItem);

        return "Item removed";
    }

    @GetMapping("/show")
    public String showCart(Model model) {
        model.addAttribute("cart", cart.getCart());
        return "showCart";
    }

    @PostMapping("/quantity")
    @ResponseBody
    public String changeQuantity(@RequestParam(defaultValue = "1") int quantity,
                                 @RequestParam String itemName) {

        Optional<CartItem> changeQuantity = cart.getCart().stream()
                .filter(cartItem -> cartItem.getProduct().getName().equals(itemName))
                .findFirst();

        CartItem cartItem = changeQuantity.get();
        cartItem.setQuantity(quantity);

        return "Quantity changed";
    }
}
