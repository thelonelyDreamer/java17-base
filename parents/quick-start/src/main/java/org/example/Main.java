package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Object, Object> of = Map.of();
        var random = Math.random();
        new Account("","");
    }

    public static sealed class A permits B{

    }

    public static non-sealed class B extends A{

    }
}