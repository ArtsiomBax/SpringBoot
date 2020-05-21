package by.artbax.service.controllers;

import by.artbax.service.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UsersController {

    @Value(("${my.property}"))
    private String myProperty;

    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/users")
    public String getUsersPage( ModelMap model){
        System.out.println(myProperty);
        model.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";



    }
}
