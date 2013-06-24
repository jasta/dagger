package com.example.dagger.simple.dummy;

public class ConcreteDummyClass89 implements DummyClass89 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
