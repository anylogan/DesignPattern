package people.employee;
import animal.*;
public interface AnimalVisitor {
    public void visit(Fish fish);
    public void visit(Ox ox);
    public void visit(Chicken chicken);

}
