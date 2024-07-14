package com.empmanager.TheEmployeeManager.repository;

import com.empmanager.TheEmployeeManager.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
