package com.example.dagger.simple.dummy;

public class ConcreteDummyClass220 implements DummyClass220 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
