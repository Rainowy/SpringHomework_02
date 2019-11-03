package pl.coderslab.spring.mvc.cart;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)

public class Cart {

    private List<CartItem> cart = new ArrayList<>();

    public List<CartItem> getCart() {
        return cart;
    }

    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }

    public void addToCart(CartItem cartItem) {
        cart.add(cartItem);
    }

    public void removeFromCart(CartItem cartItem) {
        cart.remove(cartItem);
    }
}
