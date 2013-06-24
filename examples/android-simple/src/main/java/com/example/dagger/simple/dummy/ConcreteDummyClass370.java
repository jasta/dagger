package com.example.dagger.simple.dummy;

public class ConcreteDummyClass370 implements DummyClass370 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
