package com.example.dagger.simple.dummy;

public class ConcreteDummyClass68 implements DummyClass68 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
