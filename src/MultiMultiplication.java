public class MultiMultiplication extends Expression{
    private Expression expressions[];

    public MultiMultiplication(Expression ... expression) {
        int index=0;
        for (Expression exp : expression){
            this.expressions[index]=exp;
            index++;
        }
    }
    @Override
    public String toString() {
        String returnValue="";
        for (int i = 0; i < expressions.length; i++) {
            returnValue+="("+expressions[i].toString()+"*"+")";
        }
        return returnValue;
    }

    @Override
    public double evaluate(){
        int returnValue=1;
        for (int i = 0; i < expressions.length; i++) {
            returnValue *= expressions[i].evaluate();
        }
        return returnValue;
    }
}
