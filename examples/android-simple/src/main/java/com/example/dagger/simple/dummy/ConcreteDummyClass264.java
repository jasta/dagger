package com.example.dagger.simple.dummy;

public class ConcreteDummyClass264 implements DummyClass264 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
