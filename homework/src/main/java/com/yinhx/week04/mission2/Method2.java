package com.yinhx.week04.mission2;

public class Method2 {
    private static String result = "";

    public static String helloWorld() {
        return "Hello word";
    }

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread computeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                result = helloWorld();
            }
        });
        computeThread.start();
        computeThread.join();

        System.out.println(result + (System.currentTimeMillis() - start) + " ms");
    }
}
