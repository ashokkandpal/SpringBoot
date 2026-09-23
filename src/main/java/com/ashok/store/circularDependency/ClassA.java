package com.ashok.store.circularDependency;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private final ClassB classB;

    public ClassA(){
        System.out.println("A Created");
        this.classB = new ClassB();
    }

    //public ClassA(ClassB classB){
    //    this.classB = classB;
    //}


    public void printObject(){
        System.out.println("Returning Class B Object");
    }
}
