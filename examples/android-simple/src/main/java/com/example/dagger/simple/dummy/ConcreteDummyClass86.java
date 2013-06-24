package com.example.dagger.simple.dummy;

public class ConcreteDummyClass86 implements DummyClass86 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
