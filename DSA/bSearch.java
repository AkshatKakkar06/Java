package DSA;

import java.util.Scanner;

public class bSearch {    
    public static void main(String[] args) {
        int a; int[] arr;
        Scanner sc =  new Scanner(System.in);
        a = sc.nextInt();
        arr = new int[]{2,3,4,10,40};
        bsAlgo obj = new bsAlgo();
        obj.bs(arr,a);
        }
}
class bsAlgo{
    void bs(int[] arr, int a){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==a){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(arr[mid]<a){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
    }
}
