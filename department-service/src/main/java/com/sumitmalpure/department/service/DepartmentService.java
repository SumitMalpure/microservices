package com.sumitmalpure.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumitmalpure.department.entity.Department;
import com.sumitmalpure.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
