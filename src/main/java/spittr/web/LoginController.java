package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.data.UserRepositury;
import spittr.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by admin on 2018-05-16.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    private UserRepositury userRepositury;

    @Autowired
    public LoginController(UserRepositury userRepositury){
        this.userRepositury = userRepositury;
    }

    @RequestMapping(method = POST)
    public String userLogin(User user){
        System.out.println("开始登陆验证。。。");
        User retuenUser = userRepositury.findByUserName(user.getUserName());
        if(retuenUser != null && !"".equals(retuenUser.getUserName()) ){
            if(user.getUserName().equals(retuenUser.getUserName())
                    && user.getPassWord().equals(retuenUser.getPassWord())){
                return "redirect:/spitter/"+retuenUser.getUserName();
            }
        }
        return "home";
    }
}
