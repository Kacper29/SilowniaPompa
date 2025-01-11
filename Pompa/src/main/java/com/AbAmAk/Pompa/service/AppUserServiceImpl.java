package com.AbAmAk.Pompa.service;

import com.AbAmAk.Pompa.entity.AppUser;
import com.AbAmAk.Pompa.repository.AppUserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserRepository AppUserRepository) {
        this.appUserRepository = AppUserRepository;
    }

    public AppUser findUserByUsername(String username) {
        return appUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    public void saveUser(AppUser user) {
        appUserRepository.save(user);
    }
}