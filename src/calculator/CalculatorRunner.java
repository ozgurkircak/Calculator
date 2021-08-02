package calculator;

import java.util.ArrayList;

public class CalculatorRunner {

	public static void main(String[] args) {
		// Konulabilecek alt siniflar: Statistics olabilir, geometry olabilir.
		//Integral, toplam formulu, carpim formulu, gcd,lcm, coordinatlari verilen bir poligonun alanini, 
		//cevresini bulma olabilir. Koordinatlari verilen bir ucgenin acilari bulunabilir. tipi bulunabilir.
		//System.out.println(cubicSolver(1,-2,0,1));
		//System.out.println(quadraticSolver(4,4,-4));
		//System.out.println(add(2,3));
		Calculator cal=new Calculator();
		//cal.cubicSolver(1, 5, 3, 2);
		//cal.quadraticSolver(2, -5, 2);
		//cal.isPrime(688846502588399L);
		//cal.quadraticSolver(1, -2, -3);
		//cal.valueOfaFunction(2, new double[] {-1,2,3,6});
		long n=16683179;
		System.out.println(cal.isPrime(1111234767));
		/*for(int i=2; i<45;i++) {
			if(cal.isPrime((long)(Math.pow(i, 11)+Math.pow(i, 7)+1)/(i*i+i+1))) {
				System.out.println(i);
				System.out.println((long)(Math.pow(i, 11)+Math.pow(i, 7)+1)/(i*i+i+1));
			}*/
		
		
	}

	
	
}
