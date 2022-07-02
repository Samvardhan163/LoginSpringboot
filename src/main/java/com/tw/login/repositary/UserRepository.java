package com.tw.login.repositary;

import com.tw.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository   extends JpaRepository<User, Long> {
}
