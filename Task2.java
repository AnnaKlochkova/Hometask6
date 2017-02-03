package task2;

public class Task2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 5;
double b =1.2;
String s = "apple";
System.out.println (con(a,b,s));
	}

	public static String con (int a,double b, String s) {
		double con = (a+b);
		String con1 = Double.toString(con);
		return  s + con1;
	} 
}
	

