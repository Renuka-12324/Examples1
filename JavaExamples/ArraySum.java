public class ArraySum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        int i;

        for(i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
