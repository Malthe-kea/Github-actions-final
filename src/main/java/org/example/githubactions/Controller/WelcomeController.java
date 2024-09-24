package org.example.githubactions.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping
    public String welcomeReturner(){

        return "welcome";
    }

}

