package example;

public class Main {
    public static void main(String[] args) {
        One one = new One(12,15);
        System.out.println(one.getTotal());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Two two = new Two();
        two.firstMethod(1);
        two.secondMethod(34);
        System.out.println(two.thirdMethod());
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
        Three three = new Three();
        three.setValue(1100,300);
        System.out.println(three.addValues());
    }
}
