package example;

public class Six {
     int[] arr;

    public Six(int[]arr){
        this.arr =arr;

    }
    public int arrs(){
        int sum = arr[0];
        for(int x = 0; x<arr.length; x++){
            if(arr[x]%3 == 0)
                sum +=arr[x];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,8,30,73, 2};
        Six six = new Six(arr);

        System.out.println(six.arrs());
    }
}
