package com.example.dagger.simple.dummy;

public class ConcreteDummyClass293 implements DummyClass293 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
