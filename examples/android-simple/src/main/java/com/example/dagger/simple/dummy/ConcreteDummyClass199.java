package com.example.dagger.simple.dummy;

public class ConcreteDummyClass199 implements DummyClass199 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
