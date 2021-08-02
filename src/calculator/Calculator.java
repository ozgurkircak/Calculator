package calculator;

import java.util.ArrayList;

public class Calculator {

public static final double epsilon=1E-4;
	
	
	
	
	
	
	public int add(int ...x) {
	int sum=0;
	 for(int i=0;i<x.length;i++) {
		sum +=x[i];
	}return sum;
	}
	public double add(double ...x) {
		double sum=0;
		 for(int i=0;i<x.length;i++) {
			sum += x[i];
		}return sum;
		}
	public double valueOfaFunction(double x, double ...coefficients) {
	 double value=0;
	 int len=coefficients.length;
	 for(int i=0; i<len;i++) {
		 value+=coefficients[i]*Math.pow(x, len-i-1);
		 
	 }System.out.println(value);
	 return value;
 }
	public ArrayList<Double> cubicSolver(double a, double b, double c, double d) {
		
		ArrayList<Double>roots=new ArrayList<>();
		for(int i=-100;i<101;i++) {
		
		if(f(i,a,b,c,d)==0) 
			{	roots.add((double) i);
			break;}}
			for(int i=-100;i<101;i++) {
			if(f(i,a,b,c,d)*f(i+1,a,b,c,d)<0) {
				double m=0, n=0;
				m=i+1;
				n=i;
			while(Math.abs(m-n)>0.000000000001) {
				if(f(m,a,b,c,d)*f((m+n)/2,a,b,c,d)<0) {n=(m+n)/2;}
				else if(f(n,a,b,c,d)*f((m+n)/2,a,b,c,d)<0) {m=(m+n)/2;}
				else if(f(m,a,b,c,d)==0) {roots.add(m); break;}
				else if(f(n,a,b,c,d)==0) {roots.add(n); break;}
				else if(f((m+n)/2,a,b,c,d)==0) {roots.add((m+n)/2);break;}
				} if(roots.size()==0) {roots.add(m);}
			}
		}roots.addAll(quadraticSolver(a,a*roots.get(0)+b,a*roots.get(0)*roots.get(0)+b*roots.get(0)+c));
		System.out.println(roots);
		return roots;
	}
	public double f(double x,double a, double b, double c, double d) {
		return a*x*x*x+b*x*x+c*x+d;
	}
	public ArrayList<Double> quadraticSolver(double a,double b, double c) {
		ArrayList<Double>roots=new ArrayList<>();
		roots.add((-b-Math.sqrt(b*b-4*a*c))/(2*a));
		roots.add((-b+Math.sqrt(b*b-4*a*c))/(2*a));
		System.out.println(roots);
		return roots;
	}
	public boolean isPrime(long n) {
		//It checks till the number 9,223,372,036,854,775,807. If the number is greater than 2147483647 put L at the end.
		//For example, isPrime(223372036854775807L).
		
		boolean isPrime=true;
		if(n<2) isPrime=false;
		for(long i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {isPrime=false;
			break;}
		}//System.out.println("It is "+isPrime + " that "+ n + " is prime.");
		return isPrime;}
	
	
	
}