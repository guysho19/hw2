public class RoundedExpression extends Expression{
    private double roundedValue;

    public RoundedExpression(Expression expression,int digitsAfterDecimalPoint) {
        this.roundedValue=expression.evaluate();
       // this.roundedValue = Math.round((double)expression.evaluate());
    }
    @Override
    public String toString() {
        return "("+roundedValue+")";
    }

    @Override
    public double evaluate(){
        return roundedValue;
    }
}
