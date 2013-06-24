package com.example.dagger.simple.dummy;

public class ConcreteDummyClass252 implements DummyClass252 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
