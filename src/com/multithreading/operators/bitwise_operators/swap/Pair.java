package com.multithreading.operators.bitwise_operators.swap;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x = x ^ y;  // x = 100^101 = 001
        y = y ^ x;  // y = 101^001 = 100
        x = x ^ y;  // x = 001^100 = 101
    }
}
