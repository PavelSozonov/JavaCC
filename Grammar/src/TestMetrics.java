import static org.junit.Assert.*;

import org.junit.Test;

public class TestMetrics {
	// two metrics counters for two files

	MetricsCounter mc1 = new MetricsCounter("Grammar/src/tests/code1.rb");
	MetricsCounter mc2 = new MetricsCounter("Grammar/src/tests/code2.rb");


	// Number of methods
	@Test
	public void testNOM() {			
		assertEquals(4, mc1.countNOM());
		assertEquals(10, mc2.countNOM());
	}
	
	@Test
	public void testCountStatements() {			
		assertEquals(24, mc1.countStatements());
		assertEquals(37, mc2.countStatements());
	}
	
	@Test
	public void testCountClasses() {			
		assertEquals(1, mc1.countClasses());
		assertEquals(2, mc2.countClasses());
	}
	
	
	@Test
	public void testCountInterfaces() {			
		assertEquals(0, mc1.countInterfaces());
		assertEquals(0, mc2.countInterfaces());
	}
	
	
	// Number of attributes
	@Test
	public void testNOA() {			
		assertEquals(1, mc1.countNOA());
		assertEquals(3, mc2.countNOA());
	}
	
	@Test
	public void testCountLoops() {			
		assertEquals(0, mc1.countLoops());
		assertEquals(0, mc2.countLoops());
	}
	
	@Test
	public void testCountConditions() {			
		assertEquals(0, mc1.countConditions());
		assertEquals(0, mc2.countConditions());
	}
	
	// Reuse ratio
	@Test
	public void testRR() {
		double num1 = (double) 0;
		double num2 = (double) 0.5;
		int comp1 = Double.compare(num1, mc1.countRR());
		int comp2 = Double.compare(num2, mc2.countRR());
		assertEquals(0, comp1);
		assertEquals(0, comp2);
	}
	
	// Number Of Children
	@Test
	public void testNOC() {			
		assertEquals(0, mc1.countNOC());
		assertEquals(1, mc2.countNOC());
	}
	
	// Weighted Methods per Class
	@Test
	public void testWMC() {			
		assertEquals(4, mc1.countWMC());
		assertEquals(10, mc2.countWMC());
	}
	
	
	// Class complexity
	@Test
	public void testCC() {			
		assertEquals(10, mc1.countCC());
		assertEquals(45, mc2.countCC());
	}
	
	// Response For a Class
	@Test
	public void testRFC() {			
		assertEquals(4, mc1.countRFC());
		assertEquals(11, mc2.countRFC());
	}
	
	
	// Coupling Between Objects
	@Test
	public void testCBO() {			
		assertEquals(0, mc1.countCBO());
		assertEquals(1, mc2.countCBO());
	}
	
	// Data abstract coupling
	@Test
	public void testDAC() {			
		assertEquals(0, mc1.countDAC());
		assertEquals(0, mc2.countDAC());
	}
	
	// Message passing coupling
	@Test
	public void testMPC() {			
		assertEquals(0, mc1.countMPC());
		assertEquals(2, mc2.countMPC());
	}
	

	// Coupling factor
	@Test
	public void testCF() {			
		assertEquals(0, mc1.countCF());
		assertEquals(0, mc2.countCF());
	}
	
	// Lack of Cohesion in Methods
	@Test
	public void testLCOM() {			
		assertEquals(6, mc1.countLCOM());
		assertEquals(21, mc2.countLCOM());
	}
	
	// Tight class cohesion
	@Test
	public void testTCC() {			
		assertEquals(1, mc1.countTCC());
		assertEquals(2, mc2.countTCC());
	}
	
	
	// Loose class cohesion
	@Test
	public void testLCC() {			
		assertEquals(1, mc1.countLCC());
		assertEquals(2, mc2.countLCC());
	}
	
	// Information based cohesion
	@Test
	public void testICH() {			
		assertEquals(0, mc1.countICH());
		assertEquals(0, mc2.countICH());
	}
	
	// Depth of Inheritance Tree
	@Test
	public void testDIT() {			
		assertEquals(0, mc1.countDIT());
		assertEquals(1, mc2.countDIT());
	}
	
	// Method inheritance factor
	@Test
	public void testMIF() {
		double num1 = (double) 0;
		double num2 = (double) 0.375;
		int comp1 = Double.compare(num1, mc1.countMIF());
		int comp2 = Double.compare(num2, mc2.countMIF());
		double i = mc2.countMIF();
		assertEquals(0, comp1);
		assertEquals(0, comp2);
	}
	
	// Attribute inheritance factor
	@Test
	public void testAIF() {		
		double num1 = (double) 0;
		double num2 = (double) 0.25;
		int comp1 = Double.compare(num1, mc1.countAIF());
		int comp2 = Double.compare(num2, mc2.countAIF());
		double i = mc2.countAIF();
		assertEquals(0, comp1);
		assertEquals(0, comp2);
	}
	
	// Method hiding factor
	@Test
	public void testMHF() {			
		assertEquals(0, mc1.countMHF());
		assertEquals(0, mc2.countMHF());
	}
	
	// Attribute hiding factor
	@Test
	public void testAHF() {			
		assertEquals(0, mc1.countAHF());
		assertEquals(0, mc2.countAHF());
	}
	
	// Number of methods overridden by a subclass
	@Test
	public void testNMO() {			
		assertEquals(0, mc1.countNMO());
		assertEquals(2, mc2.countNMO());
	}
	
	// Polymorphism factor
	@Test
	public void testPF() {			
		assertEquals(0, mc1.countPF());
		assertEquals(0.333, mc2.countPF());
	}
	

	// Specialization ratio
	@Test
	public void testSR() {		
		double num1 = (double) 0;
		double num2 = (double) 1;
		int comp1 = Double.compare(num1, mc1.countSR());
		int comp2 = Double.compare(num2, mc2.countSR());
		double i = mc2.countSR();
		assertEquals(0, comp1);
		assertEquals(0, comp2);

	}
	
}
