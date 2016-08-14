package org.com.ck.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.com.ck.entity.User;
import org.com.ck.service.IUserManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name="userManager")
	private IUserManager userManager;
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		userManager.addUser(user);
		return "/success";
	}
	
	public String getAllUser(HttpServletRequest request) {
		List<User> user = userManager.getAllUser();
		request.setAttribute("user", user);
		return "/userManager";
	}
	
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "/addUser";
	}
}
