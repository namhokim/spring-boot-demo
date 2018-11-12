package com.tistory.namocom.springbootdemo.account

import spock.lang.Specification

class AccountValidatorTest extends Specification {

    private AccountValidator sut

    void setup() {
        sut = new AccountValidator()
    }

    def "hash 값이 다름을 확인"() {
        given:
        Account account1 = new Account()
        account1.setName("김정보")
        account1.setAccountCode("004")
        account1.setAccountNumber("391802-02-061332")

        Account account2 = new Account()
        account2.setName("김정보")
        account2.setAccountCode("004")
        account2.setAccountNumber("391802-02-061333")

        when:
        String result1 = sut.getHash(account1)
        String result2 = sut.getHash(account2)

        then:
        result1 != result2
    }
}
