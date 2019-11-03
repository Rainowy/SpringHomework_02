package pl.coderslab.spring.mvc.cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String addToCart(@RequestParam String name,
                            @RequestParam double price,
                            @RequestParam int quantity) {

        CartItem itemToAdd = new CartItem(new Product(name, price), quantity);

        cart.addToCart(itemToAdd);

        return "Item added";

    }

    @GetMapping("/show")
//    @ResponseBody
    public String showCart(Model model) {
        model.addAttribute("cart", cart.getCart());
        return "showCart";
    }
}
