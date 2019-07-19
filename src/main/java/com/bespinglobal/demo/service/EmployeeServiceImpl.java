package com.bespinglobal.demo.service;

import com.bespinglobal.demo.repositories.cassandra.domain.Employee;
import com.bespinglobal.demo.repositories.cassandra.repository.EmployeeRepository;
import com.bespinglobal.demo.dto.EmployeeDto;
import com.bespinglobal.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.service.EmployeeServiceImpl
 * Version : 2019.07.18 v0.1
 * Created by taehyoung.yim on 2019-07-18.
 * *** 저작권 주의 ***
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDto.Response> findAll() {
        List<EmployeeDto.Response> employeesList = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> {
            employeesList.add(EmployeeDto.Response.of(employee));
        });

        return employeesList;
    }

    public EmployeeDto.Response findById(String id) {
        return employeeRepository.findById(id)
                .map(EmployeeDto.Response::of)
                .orElseThrow(NotFoundException::new);
    }

    public EmployeeDto.Response add(EmployeeDto.Create create) {

        Employee target = create.toEntity();
        Employee created = employeeRepository.save(target);

        return EmployeeDto.Response.of(created);
    }

    public void delete(String id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(NotFoundException::new);

        employeeRepository.delete(employee);
    }

    @Transactional
    public EmployeeDto.Response update(String id, EmployeeDto.Update update) {

        Employee updated = employeeRepository.findById(id)
                .map(update::apply)
                .orElseThrow(NotFoundException::new);

        return EmployeeDto.Response.of(updated);
    }
}
