package gof.behavioral.visitor;

public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }
    //the implementation of accept() method in concrete classes, its calling visit() method of Visitor and passing itself as argument
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
