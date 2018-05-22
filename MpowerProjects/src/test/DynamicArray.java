package test;
import java.util.*;

public class DynamicArray {
	public static Scanner sc;
	public static void main(String[] args) throws Exception {
		dynamicArray();
	}
	@SuppressWarnings("unchecked")
	public static void dynamicArray(){
		int lastAnswer=0;
		int index = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter the Number of sequences \"N\" of a seqList and Queries \"Q\" : ");
		int seqInput[]= new int[]{sc.nextInt(),sc.nextInt()};
		int N=seqInput[0];
		int Q=seqInput[1];
		ArrayList<Object> seqList[]=new ArrayList[N];
		for(int i=0;i<N;i++){
			seqList[i]=new ArrayList<Object>();
		}
		System.out.println("enter the input value for q,x,y");
		for(int i=0;i<Q;i++){
			int input[]= new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
			int q=input[0];
			int x=input[1];
			int y=input[2];
			if(q==1){
				index=(x^lastAnswer)%N;
				seqList[index].add(y);
			}
			else if(q==2){ 
				index=(x^lastAnswer)%N;
				lastAnswer=(int) seqList[index].get(y);
				System.out.println(lastAnswer);
			}
			for(int i1=0;i1<N;i1++){
				System.out.println(seqList[i1]);
			}
			}
		}
	}	

