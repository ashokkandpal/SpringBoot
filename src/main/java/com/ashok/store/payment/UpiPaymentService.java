package com.ashok.store.payment;

import org.springframework.stereotype.Component;

@Component
public class UpiPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Processing payment via UPI.... Payment Done");
    }
}
