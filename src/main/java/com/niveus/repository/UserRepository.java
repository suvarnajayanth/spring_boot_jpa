package com.niveus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niveus.model.User;

/**
 * @author jayanth
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
