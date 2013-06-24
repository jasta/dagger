package com.example.dagger.simple.dummy;

public class ConcreteDummyClass75 implements DummyClass75 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
