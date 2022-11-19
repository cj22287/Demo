package Pole;

public class exception_hand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int a[]=new int[3];
a[0]=78;
a[1]=90;
a[2]=86;
a[3]=19;
System.out.println(a[2]);
		}
catch(Exception e) {
	System.out.println("exception handle");
}
	}

}
