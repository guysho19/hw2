public class RoundedExpression extends Expression{
    private Expression expression;
    private int digitsAfterDecimalPoint;

    public RoundedExpression(Expression expression,int digitsAfterDecimalPoint) {
        this.expression = expression;
        this.digitsAfterDecimalPoint=digitsAfterDecimalPoint;
        //this.roundedValue = Math.round(expression.evaluate());
    }
    @Override
    public String toString() {
        return expression.toString();
    }

    @Override
    public double evaluate(){
        return (Math.round(expression.evaluate()*Math.pow(10,digitsAfterDecimalPoint)) / Math.pow(10,digitsAfterDecimalPoint));
    }
}
