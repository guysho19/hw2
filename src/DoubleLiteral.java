public class DoubleLiteral extends Expression {
    private double value;

    public DoubleLiteral(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(){
        return value;
    }
    @Override
    public String toString(){
        return "("+value+")";
    }


}
