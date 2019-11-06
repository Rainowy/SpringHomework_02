package pl.strefaserca.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class PatientController {

    @GetMapping("/ku")
    @ResponseBody
    public String patientForm() {
//        return "patientForm";
        return "SIEMANKO";
    }
}
