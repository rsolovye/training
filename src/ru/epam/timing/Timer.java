package ru.epam.timing;


import ru.epam.StringPractice;

import java.util.concurrent.TimeUnit;

// Program to measure elapsed time in Java
class Timer
{
    public static void main(String[] args) throws InterruptedException {
        Runtime rt = Runtime.getRuntime();
        long used = (rt.totalMemory() - rt.freeMemory());
        System.out.println("Used before measurement: " + (rt.totalMemory() - rt.freeMemory()));

        long startTime = System.currentTimeMillis();

        codeToTime();

        TimeUnit.SECONDS.sleep(5);


        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime - 5000;
        rt = Runtime.getRuntime();
        System.out.println("Used after measurement: " + (rt.totalMemory() - rt.freeMemory()));
        System.out.println("Diff: " + (rt.totalMemory() - rt.freeMemory() - used)/1000000 + "KB");

        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }

public static void codeToTime(){
    StringPractice sp = new StringPractice(100000);
    //System.out.println(sp.SBPratice());
    System.out.println(sp.stringConcat());
    }
}