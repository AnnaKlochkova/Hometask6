package task1;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a={1,25,58,7,96,3};
System.out.println(max(1,25,58,7,96,3));
	}
public static int max (int...a){
int max= a[0];
for(int i = 0; i < a.length; i++){
	if(max<a[i])
        max = a[i];
}
return max;
}
}