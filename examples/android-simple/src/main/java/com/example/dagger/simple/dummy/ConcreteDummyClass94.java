package com.example.dagger.simple.dummy;

public class ConcreteDummyClass94 implements DummyClass94 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
