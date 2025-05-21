package com.paulopontes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulopontes.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
