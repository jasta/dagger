package com.example.dagger.simple.dummy;

public class ConcreteDummyClass168 implements DummyClass168 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
