package com.example.dagger.simple.dummy;

public class ConcreteDummyClass65 implements DummyClass65 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
