package com.spring.crud.mysql.kubernetes.repository;
import com.spring.crud.mysql.kubernetes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}