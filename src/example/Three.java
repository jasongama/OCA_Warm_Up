package example;
interface SetValues{
    void setValue(int x, int y);
}
interface AddValues{
    int addValues();
}
public class Three implements SetValues,AddValues {
    int total = 0;
    int addx = 0;
    int addy = 0;


    @Override
    public void setValue(int x, int y) {
        this.addx = x;
        this.addy = y;
    }

    @Override
    public int addValues() {
        return total = addx + addy;
    }
}
