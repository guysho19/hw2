import java.util.Stack;

public class PolishNotationParser extends ExpressionParser{
    public PolishNotationParser() {
    }
    public int isOperator(String str){
        if (str.equals("+")){
            return 1;
        }else if (str.equals("-")){
            return 2;
        }else if (str.equals("/")){
            return 3;
        }else if (str.equals("*")){
            return 4;
        } else if (str.equals("-u")){
            return 5;
        }
        return 0;
    }

    @Override
    public Expression parse(String expressionStr){
//        Stack<Expression> operandStack=new Stack<Expression>();
//        str.split("(\\+)|(\\-)|(\\*)|(\\/)");
        String[] expressionDisassemble=expressionStr.split(" ");
        Stack<String> operandStack=new Stack<String>();
        Stack<String> operatorStack=new Stack<String>();
        for (int i = 0; i <expressionDisassemble.length ; i++) {
            int intIsOperator=isOperator(expressionDisassemble[i]);
            if (intIsOperator>0 || intIsOperator<=5){
                operatorStack.push(expressionDisassemble[i]);
            }else{
                operandStack.push(expressionDisassemble[i]);
            }
        }
        recursionAux(operandStack,operatorStack);

        //delete
        DoubleLiteral expression=new DoubleLiteral(4.5);
        return  expression;
    }
    public Expression recursionAux(Stack<String> operandStack,Stack<String> operatorStack){
        Stack<Expression> expressionStack=new Stack<Expression>();
        while (!operatorStack.isEmpty() && !operandStack.isEmpty()){
            String currentOperator = operatorStack.pop();
            int intIsOperator=isOperator(currentOperator);
            if (intIsOperator==5){
                String currentOperand = operandStack.pop();
                DoubleLiteral doubleLiteral=new DoubleLiteral(Double.parseDouble(currentOperand));
                UnaryMinus lastExpression=new UnaryMinus(doubleLiteral);
                expressionStack.push(lastExpression);
            }

        }
        return recursionAux(operandStack,operatorStack);
    }
    //implement flip Stack

}