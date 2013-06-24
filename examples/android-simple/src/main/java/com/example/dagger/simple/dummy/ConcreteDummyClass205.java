package com.example.dagger.simple.dummy;

public class ConcreteDummyClass205 implements DummyClass205 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
