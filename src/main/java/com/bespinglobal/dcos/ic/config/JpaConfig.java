package com.bespinglobal.dcos.ic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Project : Information-Collector
 * Class : com.bespinglobal.dcos.ic.config.DataSourceConfiguration
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.bespinglobal.dcos.ic.api.repositories.basic.repository"} )
public class JpaConfig {
}
