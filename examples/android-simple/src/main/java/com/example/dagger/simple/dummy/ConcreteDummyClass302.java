package com.example.dagger.simple.dummy;

public class ConcreteDummyClass302 implements DummyClass302 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
