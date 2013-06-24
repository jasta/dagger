package com.example.dagger.simple.dummy;

public class ConcreteDummyClass182 implements DummyClass182 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
