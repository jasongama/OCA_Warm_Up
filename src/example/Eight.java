package example;

public class Eight {
    int[][] array;

    public Eight(int[][]array){
    this.array = array;
    }
   public void setMultiple(int[][]array){

            this.array = array;
        }

       public int sumArray(){
        int sumArr = array[0][0];
        for(int x = 0; x< array.length; x++){
            for(int y =0; y<array.length; y++){
                sumArr++;
                if(array[x][y]%sumArr == 0) sumArr+=array[x][y];
            }
        }
        return sumArr;
       }


    public static void main(String[] args) {
        int[][] myArray = {{1,2,4},{6,6,7}};
        Eight eight = new Eight(myArray);
        eight.setMultiple(myArray);
        System.out.println(eight.sumArray());

    }
}
