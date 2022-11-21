package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	//fake user list
	List<User> list= List.of(new User(1311L, "omkar mhatre", "9969105533"),
							new User(1312L, "prathmaehs zuge", "9969105433"),
							new User(1314L, "ramesh mhatre", "99645105533"));
		

	@Override
	public User getUser(Long id) {		
		return list.stream().filter(user->user.getId().equals(id)).findAny().orElse(null);
	}

}
