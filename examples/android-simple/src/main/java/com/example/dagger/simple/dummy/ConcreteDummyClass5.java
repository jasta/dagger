package com.example.dagger.simple.dummy;

public class ConcreteDummyClass5 implements DummyClass5 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
