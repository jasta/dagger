package com.example.dagger.simple.dummy;

public class ConcreteDummyClass77 implements DummyClass77 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
