// package CountOfNumber;

public class CountOfNumbers {
    public static void main(String[] args) {
        int[]arr={0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,0};

        int count=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count=count+1;
                
            }else{
                if(count>max){
                    max=count;
                }
                count=0;  //if you want count of 1's then just comment this line.
            }
        }
        System.out.println(max);
    }
}
