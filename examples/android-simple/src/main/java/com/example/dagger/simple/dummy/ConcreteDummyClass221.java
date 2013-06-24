package com.example.dagger.simple.dummy;

public class ConcreteDummyClass221 implements DummyClass221 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
