package interpreter;

public interface Expression {
 
    int interpret();
 
    @Override
    String toString();
}
