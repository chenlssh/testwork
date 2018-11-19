package spittr.web;

import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
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

    private static Logger logger = Logger.getLogger(LoginController.class);
    private UserRepositury userRepositury;

    @Autowired
    public LoginController(UserRepositury userRepositury){
        this.userRepositury = userRepositury;
    }

    @ResponseBody
    @RequestMapping(method = POST,produces = "application/json; charset=utf-8")
    public String userLogin(@RequestBody User user,Model model){
        logger.info("开始登陆验证。。。");
        User retuenUser = userRepositury.findByUserName(user.getUserName());
        if(retuenUser != null && !"".equals(retuenUser.getUserName()) ){
            if(user.getUserName().equals(retuenUser.getUserName())
                    && user.getPassWord().equals(retuenUser.getPassWord())){
                System.out.println(retuenUser.getUserName()+"用户登陆！");
                return "{\"loginStatus\":\"1\",\"userName\":\""+retuenUser.getUserName()+"\"}";
            }
        }
        System.out.println(user.getUserName()+"账号密码错误");
        return "{\"loginStatus\":\"0\",\"userName\":\"0\"}";
    }
}
