package com.example.dagger.simple.dummy;

public class ConcreteDummyClass127 implements DummyClass127 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
