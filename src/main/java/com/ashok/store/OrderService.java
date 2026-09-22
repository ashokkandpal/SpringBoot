package com.ashok.store;

import com.ashok.store.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("stripePaymentService")PaymentService paymentService) {
       this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed, we received your payment. Thank you");
    }
}
