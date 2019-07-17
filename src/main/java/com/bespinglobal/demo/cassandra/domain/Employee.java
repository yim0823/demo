package com.bespinglobal.demo.cassandra.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.Table;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.cassandra.domain.Employee
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */
@Getter
@Table(name = "employee")
public class Employee {

    @PrimaryKey
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    @Builder
    private Employee(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee update(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        return this;
    }
}
