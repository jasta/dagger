package com.example.dagger.simple.dummy;

public class ConcreteDummyClass102 implements DummyClass102 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
