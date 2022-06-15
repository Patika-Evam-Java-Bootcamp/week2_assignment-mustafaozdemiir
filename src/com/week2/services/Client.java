package com.week2.services;

import com.week2.LowBalanceException;
import com.week2.models.Response;

import java.util.Date;

public interface Client {
      Response payment(int billType, String memberCode,double balance, double amount) throws LowBalanceException;
      Response inquire(int billType,String memberCode);
      Response inquire(int billType, String memberCode, double amount, Date billDate);
      Response cancelPayment(int billType, String memberCode, double amount,int paymentId,Date billDate);

}
