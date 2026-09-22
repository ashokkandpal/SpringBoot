package com.ashok.store.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentService implements PaymentService {
    @Override
    public void pay(){
        System.out.println("Processing payment via Stripe.... Payment Done");
    }
}
