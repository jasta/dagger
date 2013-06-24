package com.example.dagger.simple.dummy;

public class ConcreteDummyClass3 implements DummyClass3 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
