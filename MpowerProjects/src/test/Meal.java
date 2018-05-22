package test;
import java.util.Scanner;
public class Meal {
	double mealCost;
	int tipPercent;
	int taxPercent;
	double tip;
	double tax;
	double totalCost;
	public void mealCost(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the meal cost: ");
		mealCost= sc.nextDouble();
	}
	@SuppressWarnings("resource")
	public void tipPercent(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the tip percent: ");
		tipPercent= sc1.nextInt();
		tip= mealCost*tipPercent/100;
	}
	@SuppressWarnings("resource")
	public void taxPercent(){
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the tax percent: ");
		taxPercent= sc2.nextInt();
		tax= mealCost*taxPercent/100;
	}
	public void output(){	
		totalCost= mealCost+tip+tax;
		System.out.println("The total meal cost is "+ Math.round(totalCost)+" dollars.");
	}
	public static void main(String[] args) {
		Meal obj = new Meal();
		obj.mealCost();
		obj.tipPercent();
		obj.taxPercent();
		obj.output();
	}	
}	
	
	


