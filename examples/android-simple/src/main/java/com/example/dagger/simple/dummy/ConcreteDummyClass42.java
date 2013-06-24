package com.example.dagger.simple.dummy;

public class ConcreteDummyClass42 implements DummyClass42 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
