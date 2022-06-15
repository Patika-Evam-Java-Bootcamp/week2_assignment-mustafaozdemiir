package com.week2;

import com.week2.models.Response;
import com.week2.services.BillServices;

public class Main {

    public static void main(String[] args) throws LowBalanceException {

        BillServices billServices=new BillServices();
        Response response1=billServices.payment(1,"araba",10,11);
        // Response response2=billServices.payment(2,"araba2",10,11);

        if(response1.getCode().equals("0")){
            System.out.println("Başarılı işlem. Oluşturulma tarihi :"+response1.getDate());
        }else if(response1.getCode().equals("1")){
            System.out.println("Başarısız işlem. Oluşturulma tarihi :"+response1.getDate());
        }else {
            System.out.println("Hata oluştu");
        }
    }
}