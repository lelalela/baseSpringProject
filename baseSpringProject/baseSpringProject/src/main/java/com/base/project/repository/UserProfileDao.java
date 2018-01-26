package com.base.project.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.project.entity.UserProfile;

@Repository
public interface UserProfileDao extends JpaRepository<UserProfile, Integer>{
      
}