package PackageStrategy;

import java.util.Arrays;

public class classBubbleSort implements Sorting{

    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        for(int barier = arr.length-1; barier >=0; barier--){
            for(int i = 0; i<barier; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
