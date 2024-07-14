package com.empmanager.TheEmployeeManager.repository;

import com.empmanager.TheEmployeeManager.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
