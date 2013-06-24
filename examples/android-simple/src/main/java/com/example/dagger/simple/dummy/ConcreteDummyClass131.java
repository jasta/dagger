package com.example.dagger.simple.dummy;

public class ConcreteDummyClass131 implements DummyClass131 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
