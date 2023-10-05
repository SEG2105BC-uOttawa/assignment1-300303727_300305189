package design1;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

    // Instance varaibles

    private static final int NUM_OF_TESTS = 10;
    private static final long DURATION = 10000000;

    // 2D arraylist where index 0 stores statistics for getX(), index 1 stores statistics for getY(), 
    // index 2 stores statistics for getRho(), index 3 stores statistics for getTheta(), 
    private static final ArrayList<ArrayList<Long>> statsCP = new ArrayList<>(4);

    private static double generateRandomCoord() {
        double coordinate = new Random().nextInt(1001)-500;
        return coordinate;
    }

    public static long getXTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++) 
        {
            point.getX();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;

        return elapsedTime;
    }

    public static long getYTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.getY();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long getRhoTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.getRho();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long getThetaTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.getTheta();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long getDistanceTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.getDistance(point);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long rotatePointTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.rotatePoint(i);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long polarConversionTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.convertStorageToPolar();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long cartesianConversionTest(PointCP point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.convertStorageToCartesian();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static void main(String[] args) {
        
        String[] methodsArr = {"getX()", "getY()", "getRho()", "getTheta()", "getDistance()", 
        "rotatePoint()", "convertStorageToPolar()", "convertStorageToCartesian()"};

        //Testing method runtime in ms for PointCP.java in Design 1
        System.out.println("\nPointCP.java in Design 1\n");

        for (int i = 0; i <= 7; i++){
            statsCP.add(new ArrayList<>());
        }

        for (int i = 0; i < NUM_OF_TESTS; i++){
            char randomType = new Random().nextInt(2) == 0 ? 'C' : 'P';
            PointCP point = new PointCP(randomType, generateRandomCoord(), generateRandomCoord());
            statsCP.get(0).add(getXTest(point));
            statsCP.get(1).add(getYTest(point));
            statsCP.get(2).add(getRhoTest(point));
            statsCP.get(3).add(getThetaTest(point));
            statsCP.get(4).add(getDistanceTest(point));
            statsCP.get(5).add(rotatePointTest(point));
            statsCP.get(6).add(polarConversionTest(point));
            statsCP.get(7).add(cartesianConversionTest(point));
        }

        for (int i = 0; i <= 7; i++) {
            ArrayList<Long> statsArrList = statsCP.get(i);
            Collections.sort(statsArrList);

            double minTime = (double) statsArrList.get(0);
            double maxTime = (double) statsArrList.get(NUM_OF_TESTS - 1);
            double medianTime = (double) (statsArrList.get(NUM_OF_TESTS/2 - 1) + statsArrList.get(NUM_OF_TESTS/2)) / 2.0;

            System.out.println(methodsArr[i]);
            System.out.println("Min: " + minTime + "\tMedian: " + medianTime + "\tMax: " + maxTime + "\n");
        }
    }
}

