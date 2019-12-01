import java.util.*;
import java.math.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int a[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	a[i] = in.nextInt ();
      }
    int min = 99999;
    int m = abs (a,min);
    System.out.println ("" + m);
  }
  public static int abs (int a[], int min)
  {
    for (int i = 0; i<a.length; i++)
      {
	for (int j = i+1; j<a.length; j++)
	  {
	    if (a[j] < a[i])
	      {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	      }
	  }
      }
    for (int i = 0; i < a.length - 1; i++)
      {
	if (Math.abs (a[i] - a[i + 1]) < min)
	  {
	      min=Math.abs (a[i] - a[i + 1]);

	  }
      }
      return min;
  }

}

