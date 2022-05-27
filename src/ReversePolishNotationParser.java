public class ReversePolishNotationParser extends ExpressionParser{
    /**
     * this java class parses a string of reverse polish notation to an Expression
     * first it dissassemble the string by spliting it by " " into an array
     * later it pushes operands to the stack until there is an operator
     * and then it creates new expression with the operator
     * it continues until it gets to the array in the "length" place
     * @param expressionStr
     * returns regular Expression of the reverse polish notation - str
     */
    @Override
    public Expression parse(String expressionStr){
        String[] expressionDisassemble=expressionStr.split(" ");
        Stack<Expression> expressionParts=new Stack<Expression>();
        int length = expressionDisassemble.length;
        for (int i=0; i<length; i++){
            int value=isOperator(expressionDisassemble[i]);
            if (value==operandSign) {
                expressionParts.push(strToExpression(expressionDisassemble[i]));
            }
            else if (value >=additionSign && value<=multiplicationSign){
                Expression exp2 = expressionParts.pop();
                Expression exp1 = expressionParts.pop();
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