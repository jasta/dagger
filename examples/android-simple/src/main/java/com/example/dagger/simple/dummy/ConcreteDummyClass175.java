package com.example.dagger.simple.dummy;

public class ConcreteDummyClass175 implements DummyClass175 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
