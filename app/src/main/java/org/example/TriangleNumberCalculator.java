package org.example;

public class TriangleNumberCalculator {

    int value(int n) {
        return n * (n + 1) / 2;
    }

    int add(int n, int m) {
        return value(n) + value(m);
    }

    int subtract(int n, int m) {
        return value(n) - value(m);
    }

}
