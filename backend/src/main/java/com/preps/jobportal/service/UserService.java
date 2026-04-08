package com.preps.jobportal.service;

import com.preps.jobportal.dto.RegisterRequestDTO;
import com.preps.jobportal.entity.User;
import com.preps.jobportal.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService {

    User register(RegisterRequestDTO request);
}
