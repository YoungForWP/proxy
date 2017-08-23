package com.tw;

public class Main {
    public static void main(String[] args) {
//        Log log = new JDKDynamicProxy(new LogImple()).getProxy();
//        log.logging();

        Log log = new CGLibDynamicProxy().getInstance().getProxy(LogImple.class);
        log.logging();
    }
}
