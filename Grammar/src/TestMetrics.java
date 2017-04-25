import static org.junit.Assert.*;

import org.junit.Test;

public class TestMetrics {
	// two metrics counters for two files

	MetricsCounter mc1 = new MetricsCounter(Global.filesPath + "code1.rb");
	MetricsCounter mc2 = new MetricsCounter(Global.filesPath + "code2.rb");


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
	
	
	// Lack of Cohesion in Methods
	@Test
	public void testLCOM() {			
		assertEquals(0, mc1.countLCOM());
		assertEquals(0, mc2.countLCOM());
	}
	
	// Tight class cohesion
	@Test
	public void testTCC() {	
		double num1 = (double) 1;
		double num2 = (double) 1;
		int comp1 = Double.compare(num1, mc1.countTCC());
		int comp2 = Double.compare(num2, mc2.countTCC());
		double i = mc2.countTCC();
		assertEquals(0, comp1);
		assertEquals(0, comp2);
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
	

	
	// Number of methods overridden by a subclass
	@Test
	public void testNMO() {			
		assertEquals(0, mc1.countNMO());
		assertEquals(2, mc2.countNMO());
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
