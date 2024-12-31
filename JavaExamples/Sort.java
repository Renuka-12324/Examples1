import java.util.Arrays;

public class Sort {
    public static void main(String args[]){
//        int arr[] = {100,600,200,400,500};
//        String arr[] = {"sun","moon","star"};
        char arr[] = {'D','C','A','R'};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("After sorting\n" + Arrays.toString(arr));
    }
}
