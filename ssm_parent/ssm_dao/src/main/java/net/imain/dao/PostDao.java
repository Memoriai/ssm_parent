package net.imain.dao;

import net.imain.domain.Post;
import net.imain.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao {
	// 查询博文内容
	Post aphorism(Integer id);
}
