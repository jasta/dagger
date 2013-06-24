package com.example.dagger.simple.dummy;

public class ConcreteDummyClass412 implements DummyClass412 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
