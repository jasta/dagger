package com.example.dagger.simple.dummy;

public class ConcreteDummyClass314 implements DummyClass314 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
