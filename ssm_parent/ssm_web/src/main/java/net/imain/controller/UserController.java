package net.imain.controller;

import net.imain.domain.Post;
import net.imain.service.PostService;
import net.imain.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.imain.domain.User;
import net.imain.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.Random;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@Autowired
	PostService postService;
	ModelAndView view = new ModelAndView();

	@ResponseBody
	@RequestMapping(value ="/save.do", produces = "application/json; charset=utf-8")
	public String save (User user) {

		userService.save(user);
		
		return "添加成功";
	}

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login.do")
	public Object login (User user, HttpSession session) {

		String password = Md5Util.md5(user.getPassword(), user.getName());
		user.setPassword(password);

		Integer id = userService.login(user);
		String login = "index";

		if (id != null) {
//			view.addObject("username", user.getName());
//			view.setViewName("/WEB-INF/jsp/login");
			login = "jsp/login";
			session.setAttribute("username", user.getName());
		}
		return login;
	}

	@RequestMapping(value = "/out.do")
	public String out(HttpSession session) {
		session.setAttribute("username", null);
		return "WEB-INF/pages/user/home";
	}

	/**
	 * 博文广场
	 */
	@RequestMapping(value = "/text.do")
	public String text () {
		return "/jsp/text";
	}

	/**
	 * 在首页转到此controller的时候, 准备以下数据
	 * 		1. 名言警句
	 * 		2. 跳转到	登录页面
	 */
	@RequestMapping(value = "/home.do")
	public ModelAndView home() {

		Integer sum = userService.sum();

		// 准备随机数
		Random random = new Random();
		int nextInt = (random.nextInt(sum)) + 1;
		System.out.println(nextInt);

		Post aphorism = postService.aphorism(nextInt);
		view.addObject("post", aphorism.getPost());
		view.setViewName("/WEB-INF/pages/user/home");

		return view;
	}
}
