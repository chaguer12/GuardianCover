package app.service.impl;

import app.entity.User;
import app.repository.UserRepoInterface;
import app.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    private UserRepoInterface userRepo;
    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}
