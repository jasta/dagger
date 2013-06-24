package com.example.dagger.simple.dummy;

public class ConcreteDummyClass109 implements DummyClass109 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
