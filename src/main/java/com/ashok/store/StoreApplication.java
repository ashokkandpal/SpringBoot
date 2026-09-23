package com.ashok.store;

import com.ashok.store.circularDependency.ClassA;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        User user = context.getBean(User.class);

        // ------Example of Circular Dependency, ClassA needs classB and ClassB needs ClassA, so Spring won't be able to create the bean
        // ClassA classA = context.getBean(ClassA.class);
        // classA.getClassB();
        // EXAMPLE of stack overflow
        //ClassA classA = context.getBean(ClassA.class);
        //classA.printObject();
    }
}
