package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

@RestController
@RequestMapping("/docker")
public class UserController {
  @Autowired
  private UserRepository userRepo;
  
  @GetMapping("/get")
  public List<User> getAlldemo()
  {
      List<User> u=userRepo.findAll();
      return u ;
      
  }
  
  @PostMapping("/Rigister")
  public String saveUser(@RequestBody User user) {
	  userRepo.save(user);
  return "saved..";
  }
}
