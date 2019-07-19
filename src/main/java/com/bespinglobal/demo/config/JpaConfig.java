package com.bespinglobal.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.config.DataSourceConfiguration
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.bespinglobal.demo.repositories.jpa.repository"} )
public class JpaConfig {

}
