package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import org.launchcode.spaday.models.User;


@Controller
@RequestMapping( "user/add" )
public class UserController 
{
  @GetMapping
  public String displayAddUserForm()
  {
    return "user/add";
  }

  @PostMapping
  public String processAddUserForm( Model model, @ModelAttribute User user, String verify )
  {
    model.addAttribute( "user", user );
    model.addAttribute( "username", user.getUsername() );
    model.addAttribute( "email", user.getEmail() );
    if ( verify == null || user.getPassword() == null || !verify.equals(user.getPassword()) )
    {
      return "user/index";
    }
    else
    {
      model.addAttribute( "error", "Passwords must match." );
    }

    return "user/add";
  }

}
