package com.onome.code.store.user;

//import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.onome.code.exception.OnomeException;

@CrossOrigin
@RestController
@RequestMapping("/store/users")
public class UserController {

	@Autowired
	UserService userService;

	/*
	 * @GetMapping("{username}/{password}") public User
	 * getUser(@PathVariable("username") String username ,@PathVariable("password")
	 * String password){
	 * 
	 * User user = userService.isExit(username); if(user !=null) { boolean validate
	 * = userService.validateUser(user, password); if(validate) { return
	 * userService.getUser(user, validate); } }
	 * 
	 * 
	 * 
	 * return null;
	 * 
	 * }
	 */

	@PutMapping
	public boolean register(@RequestBody User user) {

		if (user == null) {
			throw new OnomeException("Registration Failed");
		} else {
			return this.userService.register(user);
		}
	}

	@PostMapping
	public boolean updateUser(@RequestBody User user) {
		if (user == null) {
			throw new OnomeException("Update Failed");
		} else {
			return this.userService.update(user);
		}
	}

	@PostMapping("/pwdupdate")
	public boolean updatePassword(@RequestBody User user) {
		if (user == null) {
			throw new OnomeException("Update Failed");
		} else {
			return this.userService.update(user);
		}
	}

	@ExceptionHandler
	public String exceptionHandler(OnomeException ex) {
		return ex.getMessage();
	}

}
