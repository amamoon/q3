package part3Q3;


public class FreeShippingDecorator extends Decorator{

    int price;
    int weight;

	public FreeShippingDecorator(Product product, int price, int weight) {
        super(product);
        this.price=price;
        this.weight=weight;
		//TODO Auto-generated constructor stub
    }
    
        
    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public int getWeight() {
        return product.getWeight();
    }

    @Override
    public double getShippingCost() {
        if(getPrice() > price && getWeight() < weight) return 0;
        return product.getShippingCost();
    }

    // TODO Complete this class

}
