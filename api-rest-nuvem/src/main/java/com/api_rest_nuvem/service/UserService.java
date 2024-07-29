package com.api_rest_nuvem.service;

import com.api_rest_nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
