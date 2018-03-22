package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by admin on 2018-03-16.
 */
@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository){
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register",method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = POST)
    public String processRegistration(Spitter spitter){
        System.out.println(spitter.getUserName());
//        spitterRepository.save(spitter);
        return "redirect:/spitter/"+spitter.getUserName();
    }

    @RequestMapping(value = "/{userName}",method = GET)
    public String showSpitterProfile(@PathVariable("userName") String userName, Model model){
        Spitter spitter = spitterRepository.findByUserName(userName);
        System.out.println(spitter.getUserName());
        System.out.println(spitter.getFirstName());
        System.out.println(spitter.getLastName());
        model.addAttribute(spitter);
        return "profile";
    }
}
