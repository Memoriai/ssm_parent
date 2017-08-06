package net.imain.dao;

import net.imain.domain.Post;
import org.springframework.stereotype.Repository;

import net.imain.domain.User;

@Repository
public interface UserDao {
	// 添加
	void add(User user);

	// 登录
	Integer login(User user);

	// 查询博文记录条数
	Integer sum();
}
