package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.data.UserRepositury;
import spittr.model.Spitter;
import spittr.data.SpitterRepository;
import spittr.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by admin on 2018-03-16.
 */
@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;
    private UserRepositury userRepositury;
    @Autowired
    public SpitterController(SpitterRepository spitterRepository){
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register",method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = POST)
    public String processRegistration(User user){
        System.out.println(user.getUserName());
        userRepositury.saveUser(user);
        return "redirect:/spitter/"+user.getUserName();
    }
//RequestParam
    @RequestMapping(value = "/{userName}",method = GET)
    public String showSpitterProfile(@PathVariable("userName") String userName,Model model){
        User user = userRepositury.findByUserName(userName);
        model.addAttribute(user);
        return "profile";
    }
    @Autowired
    @Qualifier("userAction")
    public void setUserRepositury(UserRepositury userRepositury) {
        this.userRepositury = userRepositury;
    }
}
