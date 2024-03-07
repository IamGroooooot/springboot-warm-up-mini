package com.warmupmini.warmupmini.repository;

import com.warmupmini.warmupmini.domain.attendance.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
