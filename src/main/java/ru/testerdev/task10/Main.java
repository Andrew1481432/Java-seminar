package ru.testerdev.task10;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Этого нет в экзамене, просто решил попрактиковаться в библиотеке (fastutil.di.unimi.it)
 *
 * https://github.com/firemonk9/largeMap
 */

public class Main {

    public static final int NumRecords = 30000000;
    private static Int2IntOpenHashMap intOpenHashMap = new Int2IntOpenHashMap(NumRecords, 0.5f);
    private static Object2IntMap<String> string2IntMap = new Object2IntOpenHashMap<String>(1000000);

    static {
        intOpenHashMap.defaultReturnValue(-1);
        string2IntMap.defaultReturnValue(-1);
    }

    /*
       //Double2DoubleMap d2dMap = new Double2DoubleOpenHashMap();

        //d2dMap.put( 1.1F, 1,1F);
        //Object2ObjectArrayMap
     */

    public static void add(String key, int value) {
        int hash = key.hashCode();
        int found = intOpenHashMap.get(hash);
        if (found == -1) {
            intOpenHashMap.put(hash, value);
        } else {
            string2IntMap.put(key, value);
        }
    }

    public static int get(String key) {
        if (string2IntMap.containsKey(key)) {
            return string2IntMap.get(key);
        } else {
            return intOpenHashMap.get(key.hashCode());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>(20);
        final Random random = new Random();
        int k;
        System.gc();

        long time = System.nanoTime();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long t1 = System.nanoTime();

        for (int i = 0; i < NumRecords; i++) {
            k = random.nextInt();
            String key = new BigInteger(130, random).toString(50);
            int value = random.nextInt();

            if (i % 1000000 == 0) {
                long l = System.nanoTime();
                System.out.println("the counter is " + i + " ," + (l - time));
                time = l;
            }

            add(key, value);
        }

        long t2 = System.nanoTime();
        long freeMemory1 = Runtime.getRuntime().freeMemory();
        System.gc();

        int dataSize = 1024 * 1024;
        /*
        System.out.println("Used Memory   : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/dataSize + " MB");
System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory()/dataSize + " MB");
System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory()/dataSize + " MB");
System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory()/dataSize + " MB");
         */

        System.out.println("time taken to add is : " + (t2 - t1));
        System.out.println("initial Free Memory :"+freeMemory/dataSize + " MB");
        System.out.println("final Free Memory :"+freeMemory1/dataSize + " MB");
        System.out.println("total Memory :"+totalMemory/dataSize + " MB");
    }

}
