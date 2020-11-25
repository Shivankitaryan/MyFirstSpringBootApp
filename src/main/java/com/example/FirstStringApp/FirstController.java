package com.example.FirstStringApp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    DBUser db = new DBUser();

    @GetMapping("/hi")
    public String sayHi(){
        return "Hello from server!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return db.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return db.getAUser(id);
    }


    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return db.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable int id){
        return db.deleteUser(id);
    }

}
