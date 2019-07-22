package com.bespinglobal.dcos.ic.api.response;

import lombok.Getter;

/**
 * Project : Information-Collector
 * Class : ApiException
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
@Getter
public class ApiException extends RuntimeException {

    private ApiResponseCode status;
    private String message;

    public ApiException(ApiResponseCode status, Exception e) {
        super(e);
        this.status = status;
        this.message = status.getMessage();
    }

    public ApiException(ApiResponseCode status, String message, Exception e) {
        super(e);
        this.status = status;
        this.message = message;
    }

    public ApiException(ApiResponseCode status) {
        this.status = status;
        this.message = status.getMessage();
    }

    public ApiException(ApiResponseCode status, String message) {
        this.status = status;
        this.message = message;
    }

}
