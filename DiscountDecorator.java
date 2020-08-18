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
        double price = super.getPrice();
        price = price*discount;
        double price2 = super.getPrice()-price;
        return price2;
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public double getShippingCost() {
        return super.getShippingCost();
    }


    // TODO: Complete this class

}
