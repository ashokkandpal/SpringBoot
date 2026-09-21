package com.ashok.store;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(){
        System.out.println("Processing payment via Stripe.... Payment Done");
    }
}
