package com.example.dagger.simple.dummy;

public class ConcreteDummyClass83 implements DummyClass83 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
