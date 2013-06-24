package com.example.dagger.simple.dummy;

public class ConcreteDummyClass181 implements DummyClass181 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
