package gof.behavioral.visitor;

public interface ItemElement {
    //the accept method takes Visitor argument.
    int accept(ShoppingCartVisitor visitor);
}
