package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class array2D {
	int n,p,sum;
	ArrayList<Integer> list= new ArrayList<Integer>();
	public static void main(String[] args) {
		array2D obj = new array2D();
		obj.array();
	}
	public void array(){
		Scanner sc = new Scanner(System.in);
		int[][] A= new int[6][6];
		System.out.println("Enter Matrix \"A\" Data: ");
	      for (int i = 0; i < 6; i++)
	      {
	          for (int j = 0; j < 6; j++)
	          {
	              A[i][j] = sc.nextInt();
	          }
	      }
	      sc.close();
		for(int m=0;m<4;m++){
			for(int k=0;k<4;k++){
				n=3+m;
				p=3+k;
  				for(int i=m;i<n;i++){
					for(int j=k;j<p;j++){
						if(i==m+1&&(j==k||j==k+2)){
						continue;
							}
						sum = sum+A[i][j];
						}
					}
				list.add(sum);
				sum=0;
				}
			}
		for(int g=0;g<16;g++){
			System.out.println("The sum of "+(g+1)+" HourGlass is: "+ list.get(g));
		}
		System.out.println("\n"+"The Maximum HourGlass sum found in A is: "+Collections.max(list));
		}
	}
	
