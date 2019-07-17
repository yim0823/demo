package com.bespinglobal.demo.advice;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.advice.ErrorMessage
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
@ToString
@Getter
public class ErrorMessage {

    private String field;
    private String message;

    @Builder
    public ErrorMessage(String field, String message) {
        this.field = field;
        this.message = message;
    }
}
