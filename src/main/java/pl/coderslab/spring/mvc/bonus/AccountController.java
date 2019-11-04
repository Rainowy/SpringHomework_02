package pl.coderslab.spring.mvc.bonus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@ControllerAdvice
@RequestMapping("/account")
public class AccountController {

    private AccountDAO accountDAO;

    public AccountController(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @GetMapping("/form")

    public String showPrivateForm(Model model) {
        List<String> accountType = Arrays.asList("Private", "Corporate");
        model.addAttribute("account", new Account());
        model.addAttribute("accountType", accountType);

        /** Odebranie przekierowanych atrybutów(RedirectAttributes flash) **/
        Map privateMap = (Map) model.asMap().get("privateMap");
        Object corporateMap = model.asMap().get("corporateMap");
        /** Może zostać obiektem lub możemy scastować do Mapy, tak i tak działa **/

        model.addAttribute("privateMap", privateMap);
        model.addAttribute("corporateMap", corporateMap);

        return "/bonus/signUpForm";
    }

    @PostMapping("/addAccount")
    public String submit(@ModelAttribute("account") Account account,
                         BindingResult result,
                         RedirectAttributes attributes) { //jeżeli przekierowujemy = konieczne atrybuty
        if (result.hasErrors()) return "error";

        accountDAO.addToDb(account);

        /** Poniżej jak należy przekierować do innej akcji nie tracąc parametrów **/
        attributes.addFlashAttribute("privateMap", accountDAO.showPrivate());
        attributes.addFlashAttribute("corporateMap", accountDAO.showCorporate());

        return "redirect:form";
    }
}
