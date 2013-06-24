package com.example.dagger.simple.dummy;

public class ConcreteDummyClass215 implements DummyClass215 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
