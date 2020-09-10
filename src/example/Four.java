package example;



public class Four {
    public static void main(String[] args) {

        int [] arr = new int[10];
       int add = arr[0];
        for(int i=0; i<arr.length; i++){
            add++;
            int x = (add *2);
            arr[i] = x;

            if (arr[i]%3 == 0 || arr[i]%5 == 0)   arr[i] = 0;

            System.out.println(arr[i]);
        }


    }

}
