package com.ashok.store.circularDependency;

import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private final ClassA classA;

    public ClassB(){
        System.out.println("B created");
        this.classA = new ClassA();
    }

    //public ClassB(ClassA classA){
    //    this.classA = classA;
    //}
}
