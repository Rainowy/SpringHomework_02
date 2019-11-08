package pl.strefaserca.mvc.controller;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import pl.strefaserca.mvc.model.Patient;
import pl.strefaserca.mvc.model.PatientJsonResponse;

import javax.validation.Valid;
import java.awt.*;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
//@RequestMapping("/account")
public class PatientController {

    //    @GetMapping("/")
    public String patientForm() {
        return "patientForm";
    }

    @PostMapping(value = "/savePatient", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public PatientJsonResponse savePatient(@ModelAttribute @Valid Patient patient,
                                           BindingResult result) {

        PatientJsonResponse response = new PatientJsonResponse();

        if (result.hasErrors()) {

            Map<String, String> errors = result.getFieldErrors().stream()
                    .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));

            response.setValidated(false);
            response.setErrorMessages(errors);
        } else {
            //TODO zapisanie pacjenta do bazy

            response.setValidated(true);
            response.setPatient(patient);
        }
        return response;
    }
}
