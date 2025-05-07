import java.util.Arrays;
import java.util.Scanner;
class Arr{
    public static void main(String[] args){
        // int arr[] = new int[5];
        // arr[0] = 1;
        // arr[1] = 2; 
        // arr[2] = 23;
        // arr[3] = 4;
        
        // for(int i = 0 ; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }


        // int arr[] = {1, 2, 3, 4, 5};
        // for(int i = 0 ; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int j = arr.length-1 ; j >= 0; j--){
        //     System.out.println(arr[j]);
        // }


        // for(int element : arr){
        //     System.out.println(element);
        // }


        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i =0 ; i < 5 ; i++){
            System.out.println("Enter the number"+ i + ": ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        System.out.println("The array is: ");
        for(int i =0 ; i < 5 ; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("The reverse array is: ");
        System.out.println("========================= ");
        for(int j = arr.length - 1 ; j >= 0 ; j --){
            System.out.println(arr[j]);
        }

        System.out.println("The reverse array is: ");
        System.out.println("========================= ");

        int amount = 0;
        for(int k = 0 ; k < arr.length ; k++){
             amount+= arr[k]; 
        }
        System.out.println("The sum of the array is: " + amount);

        int max = arr[0];
        int min = arr[0];

        System.out.println("The max and min array is: ");
        System.out.println("========================= ");


        for(int l = 0 ; l < arr.length ; l++){
            if(arr[l] > max){
                 max = arr[l];
            }
            if(arr[l] < min){
                min = arr[l];
            }
        }
        System.out.println("The max of the array is: " + max);
        System.out.println("The min of the array is: " + min);
    }
}