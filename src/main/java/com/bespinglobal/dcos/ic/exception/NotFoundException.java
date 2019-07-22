package com.bespinglobal.demo.exception;

/**
 * Project : demo
 * Class : NotFoundException
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super("리소스를 찾지 못했습니다.");
    }
}
