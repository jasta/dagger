package com.example.dagger.simple.dummy;

public class ConcreteDummyClass172 implements DummyClass172 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
