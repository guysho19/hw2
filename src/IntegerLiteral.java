public class IntegerLiteral extends Expression{
    private int value;

    public IntegerLiteral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "("+this.value+")";
    }

    @Override
    public double evaluate(){
        return (double) this.value;
    }
}
