package com.example.dagger.simple.dummy;

public class ConcreteDummyClass418 implements DummyClass418 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
