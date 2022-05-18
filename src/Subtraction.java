public class Subtraction {
    private  int int_value;
    private double double_value;

    public Subtraction(IntegerLiteral int1, IntegerLiteral int2) {
        this.int_value = (int) (int1.evaluate()- int2.evaluate());
    }

    public Subtraction(IntegerLiteral int1, DoubleLiteral double2) {
        this.double_value = (int1.evaluate()- double2.evaluate());
    }

    public Subtraction(DoubleLiteral double1, IntegerLiteral int2) {
        this.double_value = (double1.evaluate()- int2.evaluate());
    }

    public Subtraction(DoubleLiteral double1, DoubleLiteral double2) {
        this.double_value = (double1.evaluate()- double2.evaluate());
    }


}
