public class Multiplication extends MultiMultiplication{
    private Expression expression1;
    private Expression expression2;

    public Multiplication(Expression expression1 , Expression expression2) {
        this.expression1=expression1;
        this.expression2=expression2;
    }

    @Override
    public String toString() {
        String returnValue = "("+expression1.toString()+" * "+expression2.toString()+")";
        return returnValue;
    }

    @Override
    public double evaluate(){
        double returnValue = 1.0*expression1.evaluate()*expression2.evaluate();
        return returnValue;
    }
}
