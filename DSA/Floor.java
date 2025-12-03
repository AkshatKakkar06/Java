package DSA;
import java.util.Scanner;

public class Floor {
    public static void main(String[] arg){
        findFloor obj = new findFloor();
        obj.find();
    }
}    

class findFloor{
    private int a;
    private int[] arr={2,4,6,8,14,16,18};
    findFloor(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
    }
     void find(){
        int s,e,m;
        s=0;
        e=arr.length-1;
        if(a<arr[s]){
            System.out.println("Floor isn't present");
            return;
        }
        while(s<=e){
            m=s+(e-s)/2;
            if(arr[m]==a){
                System.out.println("The floor:"+a);
                return;
            }
            else if(arr[m]<a){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        System.out.println("The floor:"+arr[e]);
    }  
}