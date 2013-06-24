package com.example.dagger.simple.dummy;

public class ConcreteDummyClass13 implements DummyClass13 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
