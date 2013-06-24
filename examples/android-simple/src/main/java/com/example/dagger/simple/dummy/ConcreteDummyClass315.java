package com.example.dagger.simple.dummy;

public class ConcreteDummyClass315 implements DummyClass315 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
