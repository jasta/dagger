package com.example.dagger.simple.dummy;

public class ConcreteDummyClass161 implements DummyClass161 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
