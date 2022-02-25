package assignments;

public class Calculator {
	public int add() {
		int num1 = 30;
		int num2 = 20;
		int num3 = 10;
		int a=num1+num2+num3;
		return a;
		
	}
	public int sub() {
		int num1 = 30;
		int num2 = 20;
		int s = num1-num2;
		return s;
		
	}
	public double mul() {
		double num1 = 1.23456;
		double num2 = 7.89123;
		double m = num1*num2;
		return m;		
		
	}
	public float div() {
		float num1 = 30.00f;
		float num2 = 2.00f;
		float d = num1/num2;
		return d;
		
	}
	
	
		
			
		
	

	public static void main(String[] args) {
		Calculator test = new Calculator ();
		int add = test.add();
		
		Calculator test2 = new Calculator ();
		int sub = test2.sub();
		
		Calculator test3 = new Calculator ();
		double mul = test3.mul();
		
		Calculator test4 = new Calculator ();
		float div = test4.div();
		
		//double num4 = 1.23456;
		//double num5 = 7.89123;
		//float num6 = 15.00F;
		//float num7 = 5.00F;
		
		{		
		System.out.println("The added value is : " +add);
		System.out.println("The subtracted value is : " +sub);
		System.out.println("The multiplied value is : " +mul);
		System.out.println("The divided value is : " +div);
		
		//System.out.println("The multiplied value is : " +(num4*num5));
		//System.out.println("The divided value is : " +(num6/num7));
		
		
	}
		
		
		
		
		
		
		
		
		
		
				
	
		
		
				
	
		

	}
}

