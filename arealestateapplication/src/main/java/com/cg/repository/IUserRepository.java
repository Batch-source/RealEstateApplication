package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.entity.User;

public interface IUserRepository extends JpaRepository<User, String> {

}
