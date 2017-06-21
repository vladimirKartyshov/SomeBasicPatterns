package PackageStrategy;

import java.util.Arrays;

public class classSelectionSort implements Sorting{

    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        for(int barier = 0; barier < arr.length-1; barier++){
            for(int i = barier+1; i<arr.length; i++){
                if(arr[i] < arr[barier]){
                    int temp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
