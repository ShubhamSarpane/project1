package com.bank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.dao.UserRepository;
import com.bank.entity.User;

@Controller
public class HomeController {
    
	@Autowired
	UserRepository userRepository;
	//  for home page
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title","Home - My Bank");
		
		
		return "home";
	}
	
	//for signup page  
	
	
	
	  @RequestMapping("/signup")
	  public String signup(Model model) {
	  
	  model.addAttribute("title","Register - My Bank");
	  model.addAttribute("user",new User());
	  
	  return "signup";
	  }
	  
	  // this handler for do registration

	 
		
		  @RequestMapping(value="/do_register",method = RequestMethod.POST)
		  public String registerUser(@ModelAttribute("user") User user, @RequestParam(value
		  ="agreement",defaultValue ="false") boolean agreement, Model model,
		  HttpSession session){
		  
			  try {
				  User result =this.userRepository.save(user); 
					/* model.addAttribute("user", new User()); */
				  return "signup";
						   
						  
			  }
			  catch(Exception  e) {
				  System.out.println(e);
			  }
		  
		  
		  
			  return "signup";
		   }
		  
		 
	 
	
	
	
	
}



























/*
 * @RequestMapping(value="/do_register",method = RequestMethod.POST) public
 * String registerUser(@ModelAttribute("user") User user, @RequestParam(value
 * ="agreement",defaultValue ="false") boolean agreement, Model model,
 * HttpSession session){
 * 
 * try {
 * 
 * if(!agreement) {
 * System.out.println("You have not agreed the tearm and condition"); throw new
 * Exception("You have not agreed the tearm and condition"); }
 * 
 * user.setRole("ROLL_USER"); user.setEnabled(true);
 * user.setImageUrl("default.png");
 * 
 * System.out.println("Agreement " + agreement);
 * System.out.println("User"+user);
 * 
 * User result =this.userRepository.save(user); model.addAttribute("user", new
 * User());
 * 
 * session.setAttribute("message", new Message("Successfuly Register",
 * "alert-success")); return "signup";
 * 
 * 
 * } catch (Exception e) { // TODO: handle exception e.printStackTrace();
 * model.addAttribute("user", user); session.setAttribute("message", new
 * Message("someting went wrong" + e.getMessage(), "alert-danger")); return
 * "signup"; }
 * 
 * 
 * 
 * }
 */