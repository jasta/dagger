package com.example.dagger.simple.dummy;

public class ConcreteDummyClass271 implements DummyClass271 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
