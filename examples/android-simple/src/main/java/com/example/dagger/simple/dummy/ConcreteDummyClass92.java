package com.example.dagger.simple.dummy;

public class ConcreteDummyClass92 implements DummyClass92 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
