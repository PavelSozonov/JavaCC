package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import metrics.MetricsCounter;

public class MetricsTests {
	// two metrics counters for two files
//	MetricsCounter mc1 = new MetricsCounter("/code1.rb");
//	MetricsCounter mc2 = new MetricsCounter("/code2.rb");

	MetricsCounter mc1 = new MetricsCounter();
	MetricsCounter mc2 = new MetricsCounter();

	@Test
	public void testNOM() {			
		assertEquals(4, mc1.countNOM());
		assertEquals(10, mc2.countNOM());
	}
	
	@Test
	public void testNOA() {			
		assertEquals(1, mc1.countNOA());
		assertEquals(2, mc2.countNOA());
	}
	
	@Test
	public void testWMC() {			
		assertEquals(4, mc1.countWMC());
		assertEquals(10, mc2.countWMC());
	}
	
	@Test
	public void testCC() {			
		assertEquals(10, mc1.countCC());
		assertEquals(45, mc2.countCC());
	}
	
	@Test
	public void testRFC() {			
		assertEquals(4, mc1.countRFC());
		assertEquals(11, mc2.countRFC());
	}
	
	@Test
	public void testCBO() {			
		assertEquals(0, mc1.countCBO());
		assertEquals(1, mc2.countCBO());
	}
	
	@Test
	public void testDAC() {			
		assertEquals(0, mc1.countDAC());
		assertEquals(0, mc2.countDAC());
	}
	
	@Test
	public void testMPC() {			
		assertEquals(0, mc1.countMPC());
		assertEquals(2, mc2.countMPC());
	}
	

	@Test
	public void testCF() {			
		assertEquals(0, mc1.countCF());
		assertEquals(0, mc2.countCF());
	}
	
	@Test
	public void testLCOM() {			
		assertEquals(6, mc1.countLCOM());
		assertEquals(21, mc2.countLCOM());
	}
	
	@Test
	public void testTCC() {			
		assertEquals(1, mc1.countTCC());
		assertEquals(2, mc2.countTCC());
	}
	
	
	@Test
	public void testLCC() {			
		assertEquals(1, mc1.countLCC());
		assertEquals(2, mc2.countLCC());
	}
	
	@Test
	public void testICH() {			
		assertEquals(0, mc1.countICH());
		assertEquals(0, mc2.countICH());
	}
	
	@Test
	public void testDIT() {			
		assertEquals(0, mc1.countDIT());
		assertEquals(1, mc2.countDIT());
	}
	
	@Test
	public void testMIF() {			
		assertEquals(0, mc1.countMIF());
		assertEquals(0.375, mc2.countMIF());
	}
	
	@Test
	public void testAIF() {			
		assertEquals(0, mc1.countAIF());
		assertEquals(0.333, mc2.countAIF());
	}
	
	@Test
	public void testMHF() {			
		assertEquals(0, mc1.countMHF());
		assertEquals(0, mc2.countMHF());
	}
	
	@Test
	public void testAHF() {			
		assertEquals(0, mc1.countAHF());
		assertEquals(0, mc2.countAHF());
	}
	
	@Test
	public void testNMO() {			
		assertEquals(0, mc1.countNMO());
		assertEquals(2, mc2.countNMO());
	}
	
	@Test
	public void testPF() {			
		assertEquals(0, mc1.countPF());
		assertEquals(0.333, mc2.countPF());
	}
	
	@Test
	public void testRR() {			
		assertEquals(0, mc1.countRR());
		assertEquals(1, mc2.countRR());
	}
	
	@Test
	public void testSR() {			
		assertEquals(0, mc1.countSR());
		assertEquals(1, mc2.countSR());
	}
	
}
