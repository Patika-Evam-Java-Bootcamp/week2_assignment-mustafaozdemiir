package com.week2;

public class LowBalanceException extends Exception{
    String message;

    public LowBalanceException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }


}
