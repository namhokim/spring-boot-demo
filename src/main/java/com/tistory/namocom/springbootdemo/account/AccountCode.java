package com.tistory.namocom.springbootdemo.account;

import lombok.Getter;

@Getter
public enum AccountCode {
    KOREA_DEVELOPMENT_BANK("002", "KDB산업은행"),
    KOOKMIN_BANK("004", "KB국민은행");

    private String representativeCode;
    private String koreanName;

    AccountCode(String representativeCode, String koreanName) {
        this.representativeCode = representativeCode;
        this.koreanName = koreanName;
    }
}
