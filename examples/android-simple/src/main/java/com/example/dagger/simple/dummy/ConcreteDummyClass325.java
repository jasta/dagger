package com.example.dagger.simple.dummy;

public class ConcreteDummyClass325 implements DummyClass325 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
