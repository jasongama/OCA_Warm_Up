package example;

public class Two {
  int addx = 0;
  int addy = 0;
  public   void firstMethod(int y){
      addx += y;
    }

    public void secondMethod(int x){
        addy += x;
    }
   public int thirdMethod(){
       return addx + addy;
    }


}
