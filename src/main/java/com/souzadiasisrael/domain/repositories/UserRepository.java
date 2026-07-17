package com.souzadiasisrael.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souzadiasisrael.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
