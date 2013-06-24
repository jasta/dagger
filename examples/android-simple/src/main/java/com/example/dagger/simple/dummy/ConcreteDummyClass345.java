package com.example.dagger.simple.dummy;

public class ConcreteDummyClass345 implements DummyClass345 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
