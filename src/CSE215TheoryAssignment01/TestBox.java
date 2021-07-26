package CSE215TheoryAssignment01;

public class TestBox {
    public static void main(String[] args) {
        Box b1= new Box();
        System.out.println();
        System.out.println(b1 + " ==> Volume : "+b1.volume());
        System.out.println();

        Box b2= new Box(5.0);
        System.out.println(b2 + " ==> Volume : "+b2.volume());
        System.out.println();

        Box b3= new Box(2.0,4.0,6.0);
        System.out.println(b3 + " ==> Volume : "+b3.volume());
        System.out.println();

        Box b4= new Box(b3);
        System.out.println(b4 + " ==> Volume : "+b4.volume());
        System.out.println();

        System.out.println("Box b1 equal to b2: "+b1.equalTo(b2));
        System.out.println("Box b3 equal to b4: "+b3.equalTo(b4));
    }
}
