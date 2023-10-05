package design5;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class PointCP5Test {

    // Instance varaibles

    private static final int NUM_OF_TESTS = 10;
    private static final long DURATION = 10000000;
    
    // 2D arraylist where index 0 stores statistics for getX(), index 1 stores statistics for getY(), 
    // index 2 stores statistics for getRho(), index 3 stores statistics for getTheta(), 
    private static final ArrayList<ArrayList<Long>> statsCP2 = new ArrayList<>(4);
    private static final ArrayList<ArrayList<Long>> statsCP3 = new ArrayList<>(4);

    private static double generateRandomCoord() {
        double coordinate = new Random().nextInt(1001)-500;
        return coordinate;
    }

    public static long getXTestCP2(PointCP2 point) {
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

    public static long getYTestCP2(PointCP2 point) {
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

    public static long getRhoTestCP2(PointCP2 point) {
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

    public static long getThetaTestCP2(PointCP2 point) {
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

    public static long getDistanceTestCP2(PointCP2 point) {
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

    public static long rotatePointTestCP2(PointCP2 point) {
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

    public static long polarConversionTestCP2(PointCP2 point) {
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

    public static long cartesianConversionTestCP2(PointCP2 point) {
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

    public static long getXTestCP3(PointCP3 point) {
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DURATION; i++){
            point.getX();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public static long getYTestCP3(PointCP3 point) {
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

    public static long getRhoTestCP3(PointCP3 point) {
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

    public static long getThetaTestCP3(PointCP3 point) {
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

    public static long getDistanceTestCP3(PointCP3 point) {
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

    public static long rotatePointTestCP3(PointCP3 point) {
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

    public static long polarConversionTestCP3(PointCP3 point) {
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

    public static long cartesianConversionTestCP3(PointCP3 point) {
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

        //Testing method runtime in ms for PointCP2.java in Design 5
        System.out.println("\nPointCP2.java in Design 5\n");

        for (int i = 0; i <= 7; i++){
            statsCP2.add(new ArrayList<>());
        }
        for (int i = 0; i < NUM_OF_TESTS; i++){
            PointCP2 point = new PointCP2(generateRandomCoord(), generateRandomCoord());
            statsCP2.get(0).add(getXTestCP2(point));
            statsCP2.get(1).add(getYTestCP2(point));
            statsCP2.get(2).add(getRhoTestCP2(point));
            statsCP2.get(3).add(getThetaTestCP2(point));
            statsCP2.get(4).add(getDistanceTestCP2(point));
            statsCP2.get(5).add(rotatePointTestCP2(point));
            statsCP2.get(6).add(polarConversionTestCP2(point));
            statsCP2.get(7).add(cartesianConversionTestCP2(point));
        }
        for (int i = 0; i <= 7; i++) {
            ArrayList<Long> statsArrList = statsCP2.get(i);
            Collections.sort(statsArrList);

            double minTime = (double) statsArrList.get(0);
            double maxTime = (double) statsArrList.get(NUM_OF_TESTS - 1);
            double medianTime = (double) (statsArrList.get(NUM_OF_TESTS/2 - 1) + statsArrList.get(NUM_OF_TESTS/2)) / 2.0;

            System.out.println(methodsArr[i]);
            System.out.println("Min: " + minTime + "\tMedian: " + medianTime + "\tMax: " + maxTime + "\n");
        }

        //Testing method runtime in ms for PointCP3.java in Design 5
        System.out.println("\nPointCP3.java in Design 5\n");

        for (int i = 0; i <= 7; i++){
            statsCP3.add(new ArrayList<>());
        }
        for (int i = 0; i < NUM_OF_TESTS; i++){
            PointCP3 point = new PointCP3(generateRandomCoord(), generateRandomCoord());
            statsCP3.get(0).add(getXTestCP3(point));
            statsCP3.get(1).add(getYTestCP3(point));
            statsCP3.get(2).add(getRhoTestCP3(point));
            statsCP3.get(3).add(getThetaTestCP3(point));
            statsCP3.get(4).add(getDistanceTestCP3(point));
            statsCP3.get(5).add(rotatePointTestCP3(point));
            statsCP3.get(6).add(polarConversionTestCP3(point));
            statsCP3.get(7).add(cartesianConversionTestCP3(point));
        }
        for (int i = 0; i <= 7; i++){
            ArrayList<Long> statsArrList = statsCP3.get(i);
            Collections.sort(statsArrList);

            double minTime = (double) statsArrList.get(0);
            double maxTime = (double) statsArrList.get(NUM_OF_TESTS - 1);
            double medianTime = (double) (statsArrList.get(NUM_OF_TESTS/2 - 1) + statsArrList.get(NUM_OF_TESTS/2)) / 2.0;

            System.out.println(methodsArr[i]);
            System.out.println("Min: " + minTime + "\tMedian: " + medianTime + "\tMax: " + maxTime + "\n");
        }
    }
}
