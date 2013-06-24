package com.example.dagger.simple.dummy;

public class ConcreteDummyClass183 implements DummyClass183 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
