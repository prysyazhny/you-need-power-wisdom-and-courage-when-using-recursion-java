package org.example;

public class TriangleNumberCalculator {

    int value(int n) {
        if (n == 1) {
            return 1;
        }
        return n + value(n - 1);
    }

    int add(int n, int m) {
        return value(n) + value(m);
    }

    int subtract(int n, int m) {
        return value(n) - value(m);
    }

}
