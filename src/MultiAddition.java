public class MultiAddition extends Expression{
   private Expression expressions[];

    public MultiAddition(Expression ... expression) {
        int index=0;
        expressions=new Expression[expression.length];
        for (Expression exp : expression){
            this.expressions[index]=exp;
            index++;
        }
    }

    @Override
    public String toString() {
        String returnValue="(";
        for (int i = 0; i < expressions.length-1; i++) {
            returnValue+=expressions[i].toString()+" + ";
        }
        returnValue+=expressions[expressions.length-1].toString()+")";
        return returnValue;
    }

    @Override
    public double evaluate(){
        double returnValue=0.0;
        for (int i = 0; i < expressions.length; i++) {
            returnValue += expressions[i].evaluate();
        }
        return returnValue;
    }
}
