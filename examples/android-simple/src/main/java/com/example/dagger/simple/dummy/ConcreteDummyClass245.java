package com.example.dagger.simple.dummy;

public class ConcreteDummyClass245 implements DummyClass245 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
