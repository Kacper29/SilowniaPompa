package com.AbAmAk.Pompa.service;

import com.AbAmAk.Pompa.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserService {

    AppUser findUserByUsername(String username);

    void saveUser(AppUser user);
}
