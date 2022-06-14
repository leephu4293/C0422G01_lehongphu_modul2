package inheritance.bai_tap.bt3;

public class test {
    public static void main(String[] args) {
       Point point= new Point();
       MoveablePoint move= new MoveablePoint(1,1,5,4);
        System.out.println(move.move());
    }
}
