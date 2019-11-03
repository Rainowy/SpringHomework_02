package pl.coderslab.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/redirect")
public class RedirectController {


    @GetMapping( path = "/first", produces = "text/html; charset=UTF-8")
    public String showFirst(){

        return "first";

    }

    @GetMapping( path = "/third", produces = "text/html; charset=UTF-8")
    public String showThird(Model model ,@RequestParam(required = false ) String info){

        model.addAttribute("info",info);

        return "third";
    }

    @GetMapping( path = "/second", produces = "text/html; charset=UTF-8")
    public String redirect(Model model){

        model.addAttribute("info", "przekierowano z First");

        return "redirect:third";
    }
}
