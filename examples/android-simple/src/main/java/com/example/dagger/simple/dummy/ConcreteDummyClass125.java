package com.example.dagger.simple.dummy;

public class ConcreteDummyClass125 implements DummyClass125 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
