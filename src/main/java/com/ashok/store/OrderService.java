package com.ashok.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class OrderService {
    //private PaymentService paymentService;

    //public OrderService(PaymentService paymentService) {
     //   this.paymentService = paymentService;
    //}

    public void placeOrder(){
        //paymentService.processPayment();
        System.out.println("Order placed, we received your payment. Thank you");
    }

    public PaymentService getPaymentService() {
        return new PaymentService() {
            @Override
            public void processPayment() {

            }
        };
    }
}
