package com.example.dagger.simple.dummy;

public class ConcreteDummyClass151 implements DummyClass151 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
