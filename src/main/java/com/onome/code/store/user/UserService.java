package com.onome.code.store.user;

//import java.util.List;
//import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	/*
	 * public boolean validateUser(User user, String password) { Salting salt = new
	 * Salting(); String tPassword = Hashing.sha256().hashString(password + "" +
	 * salt.getSalt(user), StandardCharsets.UTF_8) .toString();
	 * 
	 * if (tPassword.equals(user.getPassword())) { return true; }
	 * 
	 * return false; }
	 */

	public boolean isExit(String username) {
		try {
			User user = this.userRepository.findAll().stream().filter(t -> t.getUsername().equals(username)).findFirst()
					.get();
			System.out.println(user.getUsername());
			return true;
		} catch (NoSuchElementException ex) {
			return false;
		}
	}

	// @CacheEvict(value="user-cache",key="'UserInCache'+#user",
	// condition="#validate == null && #!validate",beforeInvocation = true)
	// @Cacheable(value="user-cache",key="'UserInCache'+#user",
	// condition ="#validate !=null && #validate")
	public User getUser(User user, boolean validate) {
		return user;
	}

	public boolean register(User user) {
		if (this.isExit(user.getUsername())) {
			return false;
		} else {
			this.userRepository.insert(user);
			return true;
		}
	}

	public boolean update(User user) {
		if (this.isExit(user.getUsername())) {
			this.userRepository.save(user);
			return true;
		}

		return false;
	}

	public boolean updatePassword(User user) {
		if (this.isExit(user.getUsername())) {
			this.userRepository.save(user);
			return true;
		}

		return false;
	}

}
