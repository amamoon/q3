package part3Q3;

public class DiscountDecorator extends Decorator{

    private double discount;

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

	public DiscountDecorator(Product product, int discount) {
        super(product);
        this.discount = discount/100F;
        System.out.println(this.discount);
		//TODO Auto-generated constructor stub
    }
    
    @Override
    public double getPrice() {
        double price = product.getPrice();
        price = price*discount;
        double price2 = product.getPrice()-price;
        return price2;
    }

    @Override
    public int getWeight() {
        return product.getWeight();
    }

    @Override
    public double getShippingCost() {
        return product.getShippingCost();
    }


    // TODO: Complete this class

}
