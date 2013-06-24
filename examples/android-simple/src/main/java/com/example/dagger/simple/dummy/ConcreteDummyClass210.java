package com.example.dagger.simple.dummy;

public class ConcreteDummyClass210 implements DummyClass210 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
