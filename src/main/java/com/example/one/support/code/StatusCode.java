package com.example.one.support.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum StatusCode {
    SUCCESS("2000", "OK"),

    NATION_NOT_FOUND("9000", "일치하는 국가가 없습니다"),
    BAD_FORMAT("9001", "옳지 않은 입력입니다.");

    private final String code;
    private final String message;
}
