/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1.T
 2.T
 3. F
 4.T
 
 5.T
 6.F
 7.F
 8. T
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1.yes
 2.yes
 3. yes
 4.yes
 
 5.yes
 6.yes
 7.no
 8.yes

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println("REPLACE THIS STRING WITH YOUR BOOLEAN EXPRESSION");
		System.out.println(!b);
		System.out.println(b || true);
		System.out.println((x>y) && (y>z));
		System.out.println((x==y) || (x<=z));
		System.out.println(!(x%2 ==0));
		System.out.println(b && !b);
		System.out.println(b || !b);
		System.out.println(((x<y)== b));
		
		
		
	}

}
