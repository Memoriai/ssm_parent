package net.imain.service;

import net.imain.domain.Post;
import net.imain.domain.User;

public interface UserService {

	void save(User user);

	Integer login(User user);

	Integer sum();
}
