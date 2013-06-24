package com.example.dagger.simple.dummy;

public class ConcreteDummyClass430 implements DummyClass430 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
