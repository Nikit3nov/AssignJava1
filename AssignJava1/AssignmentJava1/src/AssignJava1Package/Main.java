package AssignJava1Package;

public class Main {
	static int methodCount;
	static String className;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mainInt = 1;
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Method count: " + methodCount);
		System.out.println("Class Name: " + className);
		methodCount += mainInt;
		System.out.println("Method count: " + methodCount);
		float f1 = 856.2f;
		int castFloat = (int) f1;
		System.out.println("Float: " + f1 + ", Cast float: " + castFloat);
		int x = 13;
		int y = 13;
		int z = 15;
z += (x*2)-6;
System.out.println(z);
//System.out.println(*(x==y)*(x <= y)*(x != y)*(x > y)*(z < (x+y))*(z > (x+2))*(x == y);
int b1=50;
int b2 = 19;
int b3 = b1 & b2;
System.out.println("50 AND 19 is: " + b3);
b3 = b2>>>2;
System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
b3 = (~b1)>>2;
System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
b3 = (~b1)>>>2;
System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
b3 = b2>>2;
System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
b3 = (~b1)>>2;
System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
b3 = (~b1)>>>2;
System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));


	}
}