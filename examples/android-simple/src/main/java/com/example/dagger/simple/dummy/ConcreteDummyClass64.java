package com.example.dagger.simple.dummy;

public class ConcreteDummyClass64 implements DummyClass64 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
