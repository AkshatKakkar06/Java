import java.util.Scanner;

public class codedex{
    public static void main(String[] args) {
        // Write your code here 💖
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the answer:");
        String answer = scanner.nextLine();
        String realAns = "akt";
        if(answer.equals(realAns)){
            System.out.println("Congats!");
        }
        else{
            System.out.println("oho!");
        }
    }
}

    

