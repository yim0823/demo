package com.bespinglobal.demo.config;

import com.bespinglobal.demo.component.GracefulShutdownHandlerWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.config.GracefulShutdownConfig
 * Version : 2019.07.22 v0.1
 * Created by taehyoung.yim on 2019-07-22.
 * *** 저작권 주의 ***
 */
@Configuration
public class GracefulShutdownConfig {

    private GracefulShutdownHandlerWrapper gracefulShutdownHandlerWrapper;

    @Autowired
    public GracefulShutdownConfig(GracefulShutdownHandlerWrapper gracefulShutdownHandlerWrapper) {
        this.gracefulShutdownHandlerWrapper = gracefulShutdownHandlerWrapper;
    }

    @Bean
    public UndertowServletWebServerFactory servletWebServerFactory() {

        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addDeploymentInfoCustomizers(deploymentInfo -> deploymentInfo.addOuterHandlerChainWrapper(gracefulShutdownHandlerWrapper));

        return factory;
    }
}
