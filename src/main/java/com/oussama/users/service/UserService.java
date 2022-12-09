package com.oussama.users.service;

import com.oussama.users.entities.Role;
import com.oussama.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
