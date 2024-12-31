public class Repetation {
    public static void main(String[] args){
        int arr[]={100,200,100,300,100,200,100,400};
        int num = 100;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(num + " repeted " + count + " times " );
    }
}
