package bill;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("------------------------Welcome to Pizzamania-------------------------");
		System.out.println("which pizza: (1.Veg pizza  2.Non-veg pizza  3.Delux veg pizza  4.Delux Non-veg pizza ) ===>");
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			pizza vegPizza=new pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.takeAway();
			vegPizza.getbill();
			break;
		case 2:
			pizza nonvegPizza=new pizza(false);
			nonvegPizza.addExtraToppings();
			nonvegPizza.addExtraCheese();
			nonvegPizza.takeAway();
			nonvegPizza.getbill();
			break;
		case 3:
			DeluxPizza veg=new DeluxPizza(true);
			veg.basePizzaPrice=550;
			veg.addExtraToppings();
			veg.addExtraCheese();
			veg.takeAway();
			veg.getbill();
			break;
		case 4:
			DeluxPizza  nonveg=new DeluxPizza(false);
			nonveg.basePizzaPrice=650;
			nonveg.addExtraToppings();
			nonveg.addExtraCheese();
			nonveg.takeAway();
			nonveg.getbill();
			break;
		default:
			System.out.println("Sorry Enter again!!!!");
			return;
			
		}
		sc.close();
		
	}

}
