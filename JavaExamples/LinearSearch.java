import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={100,300,500,200};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int search = sc.nextInt();
        boolean status =false;
        for(int i=0;i<=arr.length;i++){

            if(arr[i] == search){
                System.out.println("Element found");
                status=true;
                break;
            }

        }
        if(status == false){
            System.out.println("Element not found");
        }
    }
}
