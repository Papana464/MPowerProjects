package test;
import java.util.Scanner;
public class ArrayDataStructure {
	
	public void array(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int count = sc.nextInt();
		int[] A= new int[count];
		System.out.print("Enter the values of each index of an array: ");
		for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
		sc.close();
		for(int i=A.length-1;i>=0;i--){
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayDataStructure obj= new ArrayDataStructure();
		obj.array();
	}
}
