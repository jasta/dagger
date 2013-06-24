package com.example.dagger.simple.dummy;

public class ConcreteDummyClass301 implements DummyClass301 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
