package calculator;

import java.util.ArrayList;

public class CubicSolverAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cubicSolver(-3,4,-2,1));

	}
	//This method looks for real roots of a cubic equation.The general form of a cubic equation is
	//ax^3+bx^2+cx+d=0. If you enter a,b,c,d you will get a very close approximation of the roots.
public static ArrayList<Double> cubicSolver(double a, double b, double c, double d) {
		
		ArrayList<Double>roots=new ArrayList<>();
		for(int i=-100;i<101;i++) {
		
		if(f(i,a,b,c,d)==0) { 
		roots.add((double) i);
		if(f(i+0.0000001,a,b,c,d)*f(i+1,a,b,c,d)<0) {
			double m=i+0.0000001, n=i+1;
			while(Math.abs(m-n)>0.000000000001) {
				if(f(m,a,b,c,d)*f((m+n)/2,a,b,c,d)<0) {n=(m+n)/2;}
				else if(f(n,a,b,c,d)*f((m+n)/2,a,b,c,d)<0) {m=(m+n)/2;}
				else if(f(m,a,b,c,d)==0) {roots.add(m); break;}
				else if(f(n,a,b,c,d)==0) {roots.add(n); break;}
				else if(f((m+n)/2,a,b,c,d)==0) {roots.add((m+n)/2);break;}
				
				} if(Math.abs(m-n)<0.00000000001) {roots.add(m);}
			}
		}
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
				
				} if(Math.abs(m-n)<0.00000000001) {roots.add(m);}
			}
		}
		return roots;
	}
public static double f(double x,double a,double b,double c,double d) {
	return a*x*x*x+b*x*x+c*x+d;
	
}
}
