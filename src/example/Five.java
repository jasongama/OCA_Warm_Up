package example;

public class Five {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int  add = arr[0][0];

         for(int x = 0; x< arr.length; x++){
             for(int y=0; y<arr.length; y++){
                 add++;
                 int k = add * 2;
                 arr[x][y] = k;

                 if(arr[x][y]%3 == 0 || arr[x][y]%5 == 0) arr[x][y]= 0;
                 System.out.println(arr[x][y]);


             }


         }
    }
}
