package com.example.dagger.simple.dummy;

public class ConcreteDummyClass150 implements DummyClass150 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
