package readBookAndBuy.readBookAndBuy.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import readBookAndBuy.readBookAndBuy.domain.entity.Member;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String loginPage(@ModelAttribute Member user){
        return "layout/login";
    }

}
