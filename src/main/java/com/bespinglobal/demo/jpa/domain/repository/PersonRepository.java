package com.bespinglobal.demo.jpa.domain.repository;

import com.bespinglobal.demo.jpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project : demo
 * Class : PersonRepository
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
