package com.example.dagger.simple.dummy;

public class ConcreteDummyClass104 implements DummyClass104 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
