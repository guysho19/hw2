import java.util.Stack;

public class PolishNotationParser extends ExpressionParser{
    public PolishNotationParser() {
    }

    @Override
    public Expression parse(String str){
        Stack<String> operatorStack=new Stack<String>();
        Stack<Expression> operandStack=new Stack<Expression>();
        str.split("(\\+)|(\\-)|(\\*)|(\\/)");


        //delete
        DoubleLiteral expression=new DoubleLiteral(4.5);
        return  expression;
    }
}
