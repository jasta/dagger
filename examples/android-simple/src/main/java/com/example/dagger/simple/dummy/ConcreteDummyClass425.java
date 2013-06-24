package com.example.dagger.simple.dummy;

public class ConcreteDummyClass425 implements DummyClass425 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
