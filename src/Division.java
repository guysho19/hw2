public class Division extends Expression {
    private int valueInt;
    private double valueDouble;

    public Division(IntegerLiteral valueInt1, IntegerLiteral valueInt2) {
        this.valueInt = (int)valueInt1.evaluate()/(int)valueInt2.evaluate();

    }
    public Division(IntegerLiteral valueInt, DoubleLiteral valueDouble) {
        this.valueDouble = valueInt.evaluate()/valueDouble.evaluate();

    }
    public Division(DoubleLiteral valueDouble,IntegerLiteral valueInt) {
        this.valueDouble = valueDouble.evaluate()/valueInt.evaluate();

    }
    public Division(DoubleLiteral valueDouble1, DoubleLiteral valueDouble2) {
        this.valueDouble = valueDouble1.evaluate()/valueDouble2.evaluate();
    }

    @Override
    public String toString() {

    }

    @Override
    public double evaluate(){
    if
    }
}
