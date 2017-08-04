package ArraysProg;

public class NumPalindrom {
	public static void main(String args[]){

	int r,sum=0,temp;

	int n=454;
	temp=n;

	while(n>0){

	r=n%10; //r=4,5

	sum=(sum*10)+r; //454

	n=n/10; //45,4

	}

	if(temp==sum)

	System.out.println("palindrome number ");

	else

	System.out.println("not palindrome");

		}
}
