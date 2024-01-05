package pizzabillgenrator.java;

public class deluxpizza extends pizza {
	public deluxpizza(Boolean veg) {
		super(veg);
		super.addextracheese();
		super.addextratoppings();
	}
	// we are overriding here beacuse we dont want to coustmer to  add 
	@Override
	public void addextracheese() {}
	
	@Override
	public void addextratoppings() {}
	
}