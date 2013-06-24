package com.example.dagger.simple.dummy;

public class ConcreteDummyClass115 implements DummyClass115 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
