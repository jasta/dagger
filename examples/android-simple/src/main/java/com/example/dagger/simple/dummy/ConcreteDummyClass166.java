package com.example.dagger.simple.dummy;

public class ConcreteDummyClass166 implements DummyClass166 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
