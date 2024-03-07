package com.warmupmini.warmupmini.service.attendance;

import com.warmupmini.warmupmini.domain.attendance.Employee;
import com.warmupmini.warmupmini.domain.attendance.Role;
import com.warmupmini.warmupmini.domain.attendance.Team;
import com.warmupmini.warmupmini.dto.attendance.request.CreateEmployeeRequest;
import com.warmupmini.warmupmini.repository.EmployeeRepository;
import com.warmupmini.warmupmini.repository.TeamRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;

    public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository) {
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public Employee save(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = new Employee();
        employee.setBirthday(createEmployeeRequest.getBirthDate());
        employee.setManager(createEmployeeRequest.getRole() == Role.MANGER);
        employee.setWorkStartDate(createEmployeeRequest.getWorkStartDate());
        employee.setName(createEmployeeRequest.getName());
        Team team = teamRepository.findByName(createEmployeeRequest.getTeamName());
        employee.setTeam(team);
        return employeeRepository.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}