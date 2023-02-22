package com.example.cpptest;

public class Core {
    public native String concatenateMyStringWithCppString(String myString);

    static {
        System.loadLibrary("native-lib");
    }
}
