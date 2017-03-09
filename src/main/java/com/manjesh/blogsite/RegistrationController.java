package com.manjesh.blogsite;

import com.manjesh.blogsite.model.User;
import com.manjesh.blogsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 3/6/2017.
 */

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    public ModelAndView addUser(HttpServletRequest request,
                                HttpServletResponse response, @ModelAttribute("user") User user) {
        userService.register(user);
        ModelAndView modelAndView = new ModelAndView("welcome", "firstName", user);
        return modelAndView;
    }

}


/*

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;
  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());
    return mav;
  }
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("user") User user) {
  userService.register(user);
  return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
}


* */