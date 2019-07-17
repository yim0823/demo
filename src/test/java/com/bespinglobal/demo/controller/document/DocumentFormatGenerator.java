package com.bespinglobal.demo.controller.document;

import org.springframework.restdocs.snippet.Attributes;

import static org.springframework.restdocs.snippet.Attributes.key;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.controller.document.DocumentFormatGenerator
 * Version : 2019.07.16 v0.1
 * Created by taehyoung.yim on 2019-07-16.
 * *** 저작권 주의 ***
 */
public interface DocumentFormatGenerator {

    static Attributes.Attribute getDateFormat() {
        return key("format").value("yyyy-MM-dd");
    }
}
