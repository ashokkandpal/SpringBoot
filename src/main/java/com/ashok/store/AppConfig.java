package com.ashok.store;

import com.ashok.store.payment.PaymentService;
import com.ashok.store.payment.StripePaymentService;
import com.ashok.store.payment.UpiPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.ashok.store")
public class AppConfig{

    @Bean
    public User createUser(){
        return new User("Ashok Kandpal", 25);
    }

    @Bean
    @Primary
    public PaymentService upiPaymentService(){
        return new UpiPaymentService();
    }

    @Bean
    public PaymentService stripPaymentService(){
        return new StripePaymentService();
    }

    @Bean
    public OrderService orderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }
}