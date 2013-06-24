package com.example.dagger.simple.dummy;

public class ConcreteDummyClass155 implements DummyClass155 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
