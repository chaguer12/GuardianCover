package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public ModelAndView pageLoader(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
