package readBookAndBuy.readBookAndBuy.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "layout/login";
    }

}
