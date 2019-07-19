package com.bespinglobal.demo.repositories.cassandra.repository;

import com.bespinglobal.demo.repositories.cassandra.domain.Employee;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project : demo
 * Class : EmployeeRepository
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, String> {

    @AllowFiltering
    List<Employee> findByFirstName(String firstName);
}
