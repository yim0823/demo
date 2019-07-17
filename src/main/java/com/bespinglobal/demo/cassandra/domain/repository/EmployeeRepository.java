package com.bespinglobal.demo.cassandra.domain.repository;

import com.bespinglobal.demo.cassandra.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.cassandra.domain.repository.EmployeeRepository
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
