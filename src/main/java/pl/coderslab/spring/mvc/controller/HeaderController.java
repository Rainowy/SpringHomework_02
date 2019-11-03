package pl.coderslab.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/showUserAgent")
public class HeaderController {

    @GetMapping(produces = "text/html; charset=UTF-8")
    public String getUserAgent(Model model, @RequestHeader("user-agent") String userAgent) {

        model.addAttribute("uagent", userAgent);

        return "userAgent";
    }
}
