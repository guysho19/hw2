public abstract class ExpressionParser {

    public static final int operandSign = 0;
    public static final int additionSign = 1;
    public static final int subtractionSign = 2;
    public static final int divisionSign = 3;
    public static final int multiplicationSign = 4;
    public static final int unaryMinusSign = 5;
    public static final int itsNotADouble = 1;

    /**
     *
     * @param str
     * returns the parsed expression
     */
    public abstract Expression parse(String str);

    /**
     * gets a string and returns a number that the string operator represent
     * @param str
     * returns a number that the string operator represent
     */
    protected int isOperator(String str){
        if (str.equals("+")){
            return additionSign;
        }else if (str.equals("-")){
            return subtractionSign;
        }else if (str.equals("/")){
            return divisionSign;
        }else if (str.equals("*")){
            return multiplicationSign;
        } else if (str.equals("-u")){
            return unaryMinusSign;
        }
        return operandSign;
    }

    /**
     *checks if the str represent int or double
     * and hence returns IntegerLiteral of the str or DoubleLiteral of the str
     * @param str
     * returns expression of the given string
     */
    protected Expression strToExpression (String str){
        String[] checkForDouble= str.split("\\.");
        if (checkForDouble.length == itsNotADouble) {
            return new IntegerLiteral(Integer.parseInt(str));
        }
        return new DoubleLiteral(Double.parseDouble(str));
    }
}
