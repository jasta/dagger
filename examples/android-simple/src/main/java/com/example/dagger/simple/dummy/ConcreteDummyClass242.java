package com.example.dagger.simple.dummy;

public class ConcreteDummyClass242 implements DummyClass242 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
