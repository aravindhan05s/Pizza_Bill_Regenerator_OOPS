//pizza Bill Generator Using Object Oriented Programming
class Pizza{
    //variables are intialized and decelared
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppings = 150;
    private int backPack = 20;
    private int baseprize;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    //constructor to know the whether it is veg or Non-veg so depending upon that the price changes
    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        //baseprize is used to add in the bill
        baseprize = this.price;
    }
    //method for adding extra Cheese
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    //method for adding Toppings
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }
    //method for takeaway(parcel)
    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPack;
    }
    //method for generating the bill of the pizza
    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+baseprize);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Topping Added: "+extraToppings+"\n";
        }
        if(isOptedForTakeAway){
            bill += "Opted For TakeAway: "+backPack+"\n";
        }
        bill += "Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
//class for Delux Pizza (Premium)
class DeluxPizza extends Pizza{
    //Constructor for Delux pizza it already contains extra Topping and Cheese
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    //Extra cheese and Topping method is Overriden because it is already existing in delux pizza so dont need when we include in this request it doesnot adds it is overriden.
    @Override
    public void addExtraCheese() {
    }
    @Override
    public void addExtraToppings() {
    }
}
//Main function where we create the objects for the class
//for both Delux and Normal pizza
public class Main {
    public static void main(String[] args) {
       Pizza base = new Pizza(false);
        base.addExtraToppings();
        base.addExtraCheese();
        base.takeAway();
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
//It is a beginer level project in OOPs.
//So by this I learned how work with Object Oriented Programming.
