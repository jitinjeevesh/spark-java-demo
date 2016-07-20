package com.livfame.service;

import com.livfame.domain.User;

public class UserService {

    public User getUser(String id) {
        User user = new User();
        user.setId(id);
        user.setName("Jitin");
        user.setEmail("jeevesh.pandey@tothenew.com");
        return user;
    }

    public User save(User user) {
        User user1 = new User();
        user1.setId("1");
        user1.setName(user.getEmail());
        user1.setEmail(user.getName());
        return user1;
    }
}
