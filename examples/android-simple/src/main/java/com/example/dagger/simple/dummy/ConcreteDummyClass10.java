package com.example.dagger.simple.dummy;

public class ConcreteDummyClass10 implements DummyClass10 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
