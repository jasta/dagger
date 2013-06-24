package com.example.dagger.simple.dummy;

public class ConcreteDummyClass163 implements DummyClass163 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
