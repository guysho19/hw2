public class PolishNotationParser extends ExpressionParser{
private final static int indexReduce = 1;
private final static int lengthIsZero = 0;

    @Override
    public Expression parse(String expressionStr){
        String[] expressionDisassemble=expressionStr.split(" ");
        Stack<Expression> expressionParts=new Stack<Expression>();
        int length = expressionDisassemble.length-indexReduce;
        for (;length>=lengthIsZero; length--){
            int value=isOperator(expressionDisassemble[length]);
            if (value==operandSign) {
                expressionParts.push(strToExpression(expressionDisassemble[length]));
            }
            else if (value >=additionSign && value<=multiplicationSign){
                Expression exp1 = expressionParts.pop();
                Expression exp2 = expressionParts.pop();
                switch(value){
                    case additionSign:
                        expressionParts.push(new Addition(exp1,exp2));
                        break;
                    case subtractionSign:
                        expressionParts.push(new Subtraction(exp1,exp2));
                        break;
                    case divisionSign:
                        expressionParts.push(new Division(exp1,exp2));
                        break;
                    case multiplicationSign:
                        expressionParts.push(new Multiplication(exp1,exp2));
                        break;
                }
            }
            if (value == unaryMinusSign) {
                Expression exp = expressionParts.pop();
                expressionParts.push(new UnaryMinus(exp));
            }
        }
        Expression finalExpression = expressionParts.peek();
        return finalExpression;
    }
}
