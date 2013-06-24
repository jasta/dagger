package com.example.dagger.simple.dummy;

public class ConcreteDummyClass8 implements DummyClass8 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
