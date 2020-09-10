package example;

public class Seven {
     int[][]array;
    public Seven(int[][] array1){

        this.array = array1;
    }
    public int arr(){
        int sum = array[0][0];
        for(int x =0; x< array.length; x++){
            for(int j = 0; j< array.length; j++){
                if(array[x][j]%5 == 0)
                  sum += array[x][j];
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        int[][] arrs = {{5,10,20,30,1 }, {20,30,5,1,2}};
        Seven seven = new Seven(arrs);
        System.out.println(seven.arr());
    }
}
