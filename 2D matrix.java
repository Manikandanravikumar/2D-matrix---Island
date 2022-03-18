import  java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a1 = s.nextInt();
	    int b = s.nextInt();
	    int[][] a= new int[a1][b];
	    int count=0;
	    int  r=0;
	    for (int i=0; i<a1; i++)
	    {
	        for (int j=0; j<b; j++)
	        {
	            a[i][j] = s.nextInt();
	        }
	    }
	    for (int i=0; i<a1; i++)
	    {
	        for (int j=0; j<b; j++)
	        {
	            if (a[j][i]==1){
	                count++;
	            }
	        }
	        if(count>=1){
	            r++;
	        }
	        count=0;
	    }
	    System.out.println(r);
	}
}
