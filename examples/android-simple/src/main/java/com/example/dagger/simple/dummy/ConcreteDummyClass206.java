package com.example.dagger.simple.dummy;

public class ConcreteDummyClass206 implements DummyClass206 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
