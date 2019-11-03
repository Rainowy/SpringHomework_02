package pl.coderslab.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Controller
public class HelloController {

    @GetMapping(path = "/workers", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String workersAction() {

        String fileName = "/home/tomasz/workspace/Homework/SpringHomework_02/src/main/resources/workers.txt";

        Random rand = new Random();

        final String luck = String.format("%02d", rand.nextInt(29) + 1);

        String name = "";

        try {
            Stream<String> stream = Files.lines(Paths.get(fileName));//odczyt pliku do stream

            List<String> collect = stream.collect(Collectors.toList());//lista ze stream

            name = collect.stream()
                    .filter(s -> s.contains(luck))
                    .findAny()
                    .orElse("Nie ma wpisu pod tym numerem");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Wylosowano liczbę " + luck + " : " + name;
    }
}
