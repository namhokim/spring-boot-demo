package com.tistory.namocom.springbootdemo.account;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AccountValidator {
    public String getHash(Account account) {
        final String hashString = account.getName() + account.getAccountCode() + removeDashAll(account.getAccountNumber());
        try {
            final MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(hashString.getBytes(StandardCharsets.UTF_8));
            return String.format("%040x", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            return "";
        }

    }

    private String removeDashAll(String input) {
        return input.replaceAll("-", "");
    }

}
