package net.imain.service.impl;


import net.imain.dao.PostDao;
import net.imain.domain.Post;
import net.imain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;

	public Post aphorism(Integer id) {
		return postDao.aphorism(id);
	}
}
