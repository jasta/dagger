package com.example.dagger.simple.dummy;

public class ConcreteDummyClass225 implements DummyClass225 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
