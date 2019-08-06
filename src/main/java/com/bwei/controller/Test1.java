package com.bwei.controller;

public class Test1 extends Thread implements Runnable {

    @Override
    public void run() {
        System.err.println("执行了线程方法");
    }

    public static void main(String[] args) {
        new Test1().start();
    }

}
