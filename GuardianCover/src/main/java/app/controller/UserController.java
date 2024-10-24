package app.controller;

import app.entity.User;
import app.service.UserServiceInterface;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserServiceInterface userService;
    @RequestMapping("/signUp-form")
    public ModelAndView showForm(){
        ModelAndView model = new ModelAndView("/view/signUp");
        return model;
    }

    @RequestMapping("/login-form")
    public ModelAndView signInForm(){
        ModelAndView view = new ModelAndView("/view/signIn");
        return view;
    }

    @PostMapping("/sign-up")
    public ModelAndView UserSignUp(@ModelAttribute User user){
        userService.save(user);
        ModelAndView view = new ModelAndView("/view/signIn");
        return view;

    }

}
