package com.wiji.spring.boot.crud.repository;

import com.wiji.spring.boot.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
