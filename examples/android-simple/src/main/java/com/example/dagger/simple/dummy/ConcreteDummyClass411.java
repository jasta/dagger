package com.example.dagger.simple.dummy;

public class ConcreteDummyClass411 implements DummyClass411 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
