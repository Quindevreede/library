package nl.quin.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "/")
    public String sayHello(@RequestParam(required = false) String naam) {
        if (naam == null) {
            return "Hello world";
        } else {
            return "Hello " + naam + "!";
        }
    }

    @GetMapping(value = "/peter")
    public String sayPeter() {
        return "Hello Peter!";
    }

    @GetMapping(value = "/info")
    public String info() {
        return "This is the info endpoint of the Library-App";
    }

}