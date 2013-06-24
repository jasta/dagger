package com.example.dagger.simple.dummy;

public class ConcreteDummyClass284 implements DummyClass284 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
