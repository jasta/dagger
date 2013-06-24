package com.example.dagger.simple.dummy;

public class ConcreteDummyClass2 implements DummyClass2 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
