package com.forte.assesment.ForteAssesmentFabian.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.forte.assesment.ForteAssesmentFabian.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
