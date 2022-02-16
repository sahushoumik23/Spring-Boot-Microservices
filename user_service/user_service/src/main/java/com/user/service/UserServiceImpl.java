package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    List<User> list = List.of(
            new User(1311L, "Shoumik Sahu", "9348942559"),
            new User(1312L, "Faizan Azim", "9668111357"),
            new User(1313L, "Yashraj Maharana", "8895663520")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
