public class MultiMultiplication extends Expression{
    private Expression expressions[];

    public MultiMultiplication(Expression ... expression) {
        int index=0;
        if (expression.length>=2) {
            expressions = new Expression[expression.length];
            for (Expression exp : expression) {
                this.expressions[index] = exp;
                index++;
            }
        }
    }
    @Override
    public String toString() {
        String returnValue="(";
        for (int i = 0; i < expressions.length-1; i++) {
            returnValue+=expressions[i].toString()+" * ";
        }
        returnValue+=expressions[expressions.length-1].toString()+")";
        return returnValue;
    }

    @Override
    public double evaluate(){
        double returnValue=1.0;
        for (int i = 0; i < expressions.length; i++) {
            returnValue *= expressions[i].evaluate();
        }
        return returnValue;
    }
}
