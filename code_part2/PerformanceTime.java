import java.util.ArrayList;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class PerformanceTime {
    public static void main(String[] args)
    {
        int collectionSize = 167699999; //Default size of collection
        long timeElapsedArr, endTimeArr;
        long timeElapsedArrList, endTimeArrList;
        long timeElapsedVec, endTimeVec;
        long startTimeArr, startTimeArrList, startTimeVec;
        long totalArr = 0;
        long totalArrList = 0;
        long totalVec = 0;
        int testRuns = 50;

        // Create a Random object
        Random random = new Random();

        //ARRAY
        // Create an array to store the random integers
        int[] randomIntsArr = new int[collectionSize];
        long startTimeArr1 = System.currentTimeMillis();

        // Populate the array with random integers
        for (int i = 0; i < collectionSize; i++) {
            int randomNumber = random.nextInt(10); // Generates numbers from 0 to 9
            randomIntsArr[i] = randomNumber;
        }
        long endTimeArr1 = System.currentTimeMillis();
        long timeElapsed1 = endTimeArr1 - startTimeArr1;
        System.out.println("Array: " + timeElapsed1 + "ms");


        //ARRAYLIST
        // Create an ArrayList to store the random integers
        ArrayList<Integer> randomIntsArrList = new ArrayList<>(collectionSize);
        long startTimeArrList1 = System.currentTimeMillis();

        // Populate the ArrayList with random integers
        for (int i = 0; i < collectionSize; i++) {
            int randomNumber = random.nextInt(10); // Generates numbers from 0 to 9
            randomIntsArrList.add(randomNumber);
        }
        long endTimeArrList1 = System.currentTimeMillis();
        long timeElapsed2 = endTimeArrList1 - startTimeArrList1;
        System.out.println("ArrayList: " + timeElapsed2 + " ms");


        //VECTOR
        // Create a Vector to store the random integers
        Vector<Integer> randomIntsVec = new Vector<>(collectionSize);
        long startTimeVec1 = System.currentTimeMillis();

        // Populate the Vector with random integers
        for (int i = 0; i < collectionSize; i++) {
            int randomNumber = random.nextInt(10); // Generates numbers from 0 to 9
            randomIntsVec.add(randomNumber);
        }
        long endTimeVec1 = System.currentTimeMillis();
        long timeElapsed3 = endTimeVec1 - startTimeVec1;
        System.out.println("Vector: " + timeElapsed3 + " ms");
        

        for (int i = 0; i < testRuns; i++){
            
            //Measure runtime to sum up elements in array
            startTimeArr = System.currentTimeMillis();
            getSumOfArray(randomIntsArr);
            endTimeArr = System.currentTimeMillis();
            timeElapsedArr = endTimeArr - startTimeArr;
            totalArr += timeElapsedArr;

            //Measure runtime to sum up elements in arraylist
            startTimeArrList = System.currentTimeMillis();
            getSumOfArrayList(randomIntsArrList);
            endTimeArrList = System.currentTimeMillis();
            timeElapsedArrList = endTimeArrList - startTimeArrList;
            totalArrList += timeElapsedArrList;

            //Measure runtime to sum up elements in vector
            startTimeVec = System.currentTimeMillis();
            getSumOfVector(randomIntsVec);
            endTimeVec = System.currentTimeMillis();
            timeElapsedVec = endTimeVec - startTimeVec;
            totalVec += timeElapsedVec;
        }

        // Display results
        System.out.println("Sum of Array time: " + totalArr/testRuns + " ms");
        System.out.println("Sum of ArrayList time: " + totalArrList/testRuns + " ms");
        System.out.println("Sum of Vector time: " + totalVec/testRuns + " ms");
    }

    public static long getSumOfArray(int[] array)
    {
        long sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += (long)array[i];
        return sum;
    }

    public static long getSumOfArrayList(ArrayList<Integer> list)
    {
        long sum = 0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            sum += (long)it.next();
        return sum;
    }

    public static long getSumOfVector(Vector<Integer> vector)
    {
        long sum = 0;
        Iterator<Integer> it = vector.iterator();
        while(it.hasNext())
            sum += (long)it.next();
        return sum;
    }
}
