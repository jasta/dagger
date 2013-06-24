package com.example.dagger.simple.dummy;

public class ConcreteDummyClass160 implements DummyClass160 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
