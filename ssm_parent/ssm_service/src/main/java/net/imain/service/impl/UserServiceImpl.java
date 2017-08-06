package net.imain.service.impl;

import net.imain.domain.Post;
import net.imain.utils.Md5Util;
import net.imain.utils.SysContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import net.imain.dao.UserDao;
import net.imain.domain.User;
import net.imain.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private SimpleMailMessage mailMessage;

	@Autowired
	private JavaMailSenderImpl mailSender;
	
	public void save(final User user) {
		String pass = Md5Util.md5(SysContext.DEFAULT_PASS, user.getName());
		user.setPassword(pass);

		if (user.getSex().equals("男")) {
			user.setSex("1");
		} else {
			user.setSex("0");
		}

		Thread thread = new Thread(new Runnable() {
			public void run() {
				mailMessage.setSubject("你好，这是一封来自曾小晨的邮件");
				mailMessage.setText("这是我做的一个 ssm 小项目.");
				mailMessage.setTo(user.getEmail());

				mailSender.send(mailMessage);
			}
		});

		thread.start();

		userDao.add(user);
	}

	public Integer login(User user) {
		return userDao.login(user);
	}

	public Integer sum() {
		return userDao.sum();
	}
}
