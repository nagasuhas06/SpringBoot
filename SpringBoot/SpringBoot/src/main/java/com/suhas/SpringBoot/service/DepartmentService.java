package com.suhas.SpringBoot.service;

import com.suhas.SpringBoot.entity.Department;
import com.suhas.SpringBoot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(long departmentId);

    public Department updateDepartment(long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}