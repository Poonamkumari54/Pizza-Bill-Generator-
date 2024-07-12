package bill;

public class DeluxPizza extends pizza {
	public DeluxPizza(Boolean veg) {
		super(veg);
		
	}
	public void addExtraCheese() {
		this.price+=extraCheesePrice;
	}
	public void addExtraToppings() {
		this.price+=extraToppingsPrice;
	}

}
