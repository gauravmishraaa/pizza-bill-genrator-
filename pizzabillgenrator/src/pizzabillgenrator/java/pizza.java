package pizzabillgenrator.java;

public class pizza {

  private int  price;
  private Boolean veg;
  private int extracheeseprice = 100;
  private int extratoppingsprice = 150;
  private int takeawayprice = 20;
  private int basepizzaprice;
  private boolean isextracheeseadded = false;
  private boolean istoppingsadded = false;
  private boolean istakeawayadded = false;
  public pizza(Boolean veg) {
	  this.veg = veg;
	  if(this.veg) {
		  this.price = 300;
	  }else {
		  this.price = 400;
	  }
	basepizzaprice = this.price;
  }
  public void addextracheese() {
	  isextracheeseadded = true;
	  System.out.println("extra cheese added");
	  price = this.price + extracheeseprice;
	  
  }
  public void addextratoppings() {
	  istoppingsadded = true;
	  System.out.println("extra toppings added ");
	  this.price += extratoppingsprice;
	  
	  
  }
  public void takeaway() {
	
	  istakeawayadded = true;
	System.out.println("take away added ");
	this.price += takeawayprice;
}
  public void getbill() {
	  String bill = " ";
	 System.out.println("pizza:" + basepizzaprice );
	 if(isextracheeseadded) {
	   bill = "extra cheese added :" + extracheeseprice +"\n"; 
	 }

	 if(istoppingsadded) {
	   bill = "extra toppings added :" + extratoppingsprice +"\n"; 
	 }

	 if(istakeawayadded) {
	   bill = "take away added :" + takeawayprice + "\n"; 
	 }
	 bill += "bill :" + this.price;
	  System.out.println(bill);
	  
  }
  /**
   * how our bill be look like 
   * 
   * base pizza = 300;
   * Tapings=  150;
   * cheese = 100;
   * take away  = 20
   */

}
