public class Subtraction extends Expression {
    private Expression expression1;
    private Expression expression2;

    public Subtraction(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    @Override
    public String toString() {
        return "("+expression1.toString()+"-"+expression2.toString()+")";
    }

    @Override
    public double evaluate(){
        return expression1.evaluate()-expression2.evaluate();
    }
}
