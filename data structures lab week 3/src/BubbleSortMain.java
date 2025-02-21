import java.util.ArrayList;
import java.util.Random;

public class BubbleSortMain {
    public static void iterateCubes(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                    System.out.println("i: " + i + "j: " + j + "k: " + k);
                }
            }
        }
    }
    public static void iterateSquares(int n){
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: "+ i + "j: " + j);
            }
        }
    }
    public static void main(String[] args) {
    //    Runnable task1 = () -> iterateCubes(5);
    //    Runnable task2 = () -> iterateSquares(10);
    //    PerformanceMetrics.measureRuntime(task1);
    //    System.out.println("===================================");
    //    PerformanceMetrics.measureRuntime(task2);
        ArrayList<Integer> testArray = generateRandomArray(10000);
        ArrayList<Integer> arrayTwo = new ArrayList<>(testArray);
        System.out.println(testArray);
        Runnable sort1 = () -> Sort.bubbleSort1(testArray);
        Runnable sort2 = () -> Sort.bubbleSort2(arrayTwo);
        PerformanceMetrics.measureRuntime(sort1);
        PerformanceMetrics.measureRuntime(sort2);
    }
    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i =0;i<n;i++){
            list.add(random.nextInt(100000));
        }
        return list;
    }

}
