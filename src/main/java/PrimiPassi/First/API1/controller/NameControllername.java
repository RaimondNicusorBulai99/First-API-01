package PrimiPassi.First.API1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameControllername {

    @GetMapping
    public String getRequest() {
        return "Raimond Nicusor Bulai";
    }

    @PostMapping
    public StringBuilder postRequest() {
        StringBuilder stringBuilder = new StringBuilder(getRequest());
        StringBuilder stringBuilderReverse = stringBuilder.reverse();
        return stringBuilderReverse;
    }
}
