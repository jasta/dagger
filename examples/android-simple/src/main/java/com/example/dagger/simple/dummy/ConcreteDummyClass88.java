package com.example.dagger.simple.dummy;

public class ConcreteDummyClass88 implements DummyClass88 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
