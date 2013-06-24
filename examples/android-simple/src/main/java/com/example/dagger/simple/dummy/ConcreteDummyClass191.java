package com.example.dagger.simple.dummy;

public class ConcreteDummyClass191 implements DummyClass191 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
