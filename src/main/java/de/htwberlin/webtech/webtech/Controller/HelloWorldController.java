package de.htwberlin.webtech.webtech.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class HelloWorldController {

    @GetMapping(path = "/helloworld")
    public String helloWorldController(){
        return "helloworld";
    }
}
