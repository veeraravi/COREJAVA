package com.javaclasses.exceptions;

import java.io.IOException;

public class ThrowsDemo2 {

    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException
    {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        ThrowsDemo2 obj = new ThrowsDemo2();
        obj.p();
        System.out.println("normal flow...");
    }
}