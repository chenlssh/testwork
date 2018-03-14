package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by admin on 2018-02-04.
 */
@Controller
@RequestMapping({"/","homepage"})
public class HomeController {
    @RequestMapping( method = GET)
    public String Home() {
        return "home";
    }
}
