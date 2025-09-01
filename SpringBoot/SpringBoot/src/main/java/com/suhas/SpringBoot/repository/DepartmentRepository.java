package com.suhas.SpringBoot.repository;

import com.suhas.SpringBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    @Query(value = "", nativeQuery = true) /* here we can write our own sql query
    using @Query annotation. */
    public Department findByDepartmentNameIgnoreCase(String departmentName);


}