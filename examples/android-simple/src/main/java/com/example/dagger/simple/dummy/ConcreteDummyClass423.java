package com.example.dagger.simple.dummy;

public class ConcreteDummyClass423 implements DummyClass423 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
