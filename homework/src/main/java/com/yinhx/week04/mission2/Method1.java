package com.yinhx.week04.mission2;

public class Method1 {

    private static String result = "";

    public static String helloWorld() {
        return "Hello word";
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            result = helloWorld();
        }, "thread");
        thread.start();
        Thread.sleep(1000);

        System.out.println(result + (System.currentTimeMillis() - start) + " ms");
    }
}
