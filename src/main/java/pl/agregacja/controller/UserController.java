package pl.agregacja.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.agregacja.creation.User;
import pl.agregacja.creation.UserDao;

import java.awt.print.Book;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public String hello() {
        User user = new User();
        user.setUser_name("Benek");
        user.setUser_email("benek@gmail.com");
        userDao.saveUser(user);
        return "Id dodanego użytkownika to:"
                + user.getId();
    }

    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public String getUser(@PathVariable int id) {
        User user = userDao.findById(id);
        return user.toString();
    }
    @RequestMapping("/user/delete/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable int id) {
        User user = userDao.findById(id);
        userDao.delete(user);
        return "deleted";
    }
    @RequestMapping("/user/all")
    @ResponseBody
    public String findAll() {
        List<User> all = userDao.findAll();
        all.forEach(b -> logger.info(b.toString()));
        return "findAll";
    }
}

