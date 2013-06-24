package com.example.dagger.simple.dummy;

public class ConcreteDummyClass209 implements DummyClass209 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
