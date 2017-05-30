package br.com.rbarbioni.gcloud.controller;

import br.com.rbarbioni.gcloud.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renan on 27/05/17.
 */

@RestController
@RequestMapping("/user")
public class UserController {


    List<User> users = new ArrayList<>();

    public UserController(){
        for (int i = 0; i < 10; i++) {
            users.add(new User("user" + i, "user" + i + "@email.com"));
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll (){
        return this.users;
    }

}
