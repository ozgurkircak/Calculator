package calculator;

import java.util.ArrayList;

public class PolynomialSolver {
	public static final double eps=1E-4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(polySolver(new double[] {11,3,2,7,2,1,-2,-3,-7}));

	}
	public static ArrayList<Double> polySolver(double[] coeff){
		ArrayList<Double>roots=new ArrayList<>();
		for(int j=-100;j<101;j++) {
			if(f(j,coeff)==0)roots.add((double) j);
		}if(roots.size()!=coeff.length-1) {
		for(double i=-100;i<101;i+=eps) {
			if(f(i,coeff)==0)roots.add(i);
			else if(f(i,coeff)*f(i+eps,coeff)<0)roots.add(i+eps/2);
		}}return roots;
	}
	public static double f(double x, double[] coeff) {
		int len=coeff.length;
		double sum=0;
		for(int i=0; i<len; i++) {
			sum+=coeff[i]*Math.pow(x,len- i-1);
		}
		return sum;
	}

}
