package com.example.dagger.simple.dummy;

public class ConcreteDummyClass106 implements DummyClass106 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
