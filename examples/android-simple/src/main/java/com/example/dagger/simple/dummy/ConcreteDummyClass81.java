package com.example.dagger.simple.dummy;

public class ConcreteDummyClass81 implements DummyClass81 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
