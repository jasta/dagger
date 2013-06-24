package com.example.dagger.simple.dummy;

public class ConcreteDummyClass217 implements DummyClass217 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
