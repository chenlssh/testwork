package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spittr.data.UserRepositury;
import spittr.model.User;

import javax.servlet.http.HttpServletRequest;

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


    @ResponseBody
    @RequestMapping(method = POST)
    public String userLogin(@RequestBody User user,Model model){
        System.out.println("开始登陆验证。。。");
        User retuenUser = userRepositury.findByUserName(user.getUserName());
        if(retuenUser != null && !"".equals(retuenUser.getUserName()) ){
            if(user.getUserName().equals(retuenUser.getUserName())
                    && user.getPassWord().equals(retuenUser.getPassWord())){
                System.out.println(retuenUser.getUserName()+"用户登陆！");
                return "redirect:/spitter/"+retuenUser.getUserName();
            }
        }
        model.addAttribute(user);
        System.out.println(user.getUserName()+"账号密码错误");
        return "home";
    }
}
