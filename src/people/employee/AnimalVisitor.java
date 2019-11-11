package people.employee;
import room.ChickenCoop;

public interface AnimalVisitor {
    public void visit(ChickenCoop chickenCoop);
}
