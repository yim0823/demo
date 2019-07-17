package com.bespinglobal.demo.response;

import com.bespinglobal.demo.utils.EnumType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Project : demo
 * Class : ApiResponseCode
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
@Getter
@RequiredArgsConstructor
public enum ApiResponseCode implements EnumType {

    OK("요청이 성공하였습니다."),
    BAD_PARAMETER("요청 파라미터가 잘못되었습니다."),
    NOT_FOUND("리소스를 찾지 못했습니다."),
    UNAUTHORIZED("인증에 실패하였습니다."),
    SERVER_ERROR("서버 에러입니다.");

    private final String message;

    public String getId() {
        return name();
    }

    @Override
    public String getText() {
        return message;
    }
}
