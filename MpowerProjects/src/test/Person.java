package test;
import java.util.Scanner;
public class Person {
	int age;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int Age=sc.nextInt();
		Person obj=new Person(Age);
		sc.close();
		obj.amIOld();
		obj.yearPasses();

	}
	public Person(int initialAge){
		if(initialAge>=0){
			age = initialAge;
		}else{
			age =0;
			System.out.print("Age is not valid");
		}
	}
	// This is my second commit.
	public void yearPasses(){
		age=age+1;
	
	}
	public void amIOld(){
		if(age>0){
			if(age<13){
				System.out.print("You are young..");
			}
			else if(age>=13&age<18){
				System.out.print("You are teenager");
			}else{
				System.out.print("You are old..");
			}
		}
	}
}
