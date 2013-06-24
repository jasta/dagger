package com.example.dagger.simple.dummy;

public class ConcreteDummyClass187 implements DummyClass187 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
