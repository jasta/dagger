package com.example.dagger.simple.dummy;

public class ConcreteDummyClass93 implements DummyClass93 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
