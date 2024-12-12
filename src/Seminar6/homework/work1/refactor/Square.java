package Seminar6.homework.work1.refactor;

public class Square extends QuadRangle{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
