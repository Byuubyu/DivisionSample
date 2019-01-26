package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void testDivided01() {
		try {
			assertEquals("3330", Division.divided("10000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided02() {
		try {
			assertEquals("333", Division.divided("1000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided03() {
		try {
			assertEquals("33.3", Division.divided("100", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided04() {
		try {
			assertEquals("3.33", Division.divided("10", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided05() {
		try {
			assertEquals("0.333", Division.divided("1", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided06() {
		try {
			assertEquals("0.0333", Division.divided("1", "30"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided07() {
		try {
			assertEquals("0.00333", Division.divided("1", "300"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided08() {
		try {
			assertEquals("0.000333", Division.divided("1", "3000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided09() {
		try {
			assertEquals("0.0000333", Division.divided("1", "30000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided10() {
		try {
			assertEquals("23300", Division.divided("70000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided11() {
		try {
			assertEquals("2330", Division.divided("7000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided12() {
		try {
			assertEquals("233", Division.divided("700", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided13() {
		try {
			assertEquals("23.3", Division.divided("70", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided14() {
		try {
			assertEquals("2.33", Division.divided("7", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided15() {
		try {
			assertEquals("0.233", Division.divided("7", "30"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided16() {
		try {
			assertEquals("0.0233", Division.divided("7", "300"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided17() {
		try {
			assertEquals("0.00233", Division.divided("7", "3000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided18() {
		try {
			assertEquals("0.000233", Division.divided("7", "30000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided19() {
		try {
			assertEquals("3330", Division.divided("1", "0.0003"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided20() {
		try {
			assertEquals("333", Division.divided("1", "0.003"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided21() {
		try {
			assertEquals("33.3", Division.divided("1", "0.03"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided22() {
		try {
			assertEquals("3.33", Division.divided("1", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided23() {
		try {
			assertEquals("0.333", Division.divided("0.1", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided24() {
		try {
			assertEquals("0.0333", Division.divided("0.01", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided25() {
		try {
			assertEquals("0.00333", Division.divided("0.001", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided26() {
		try {
			assertEquals("0.000333", Division.divided("0.0001", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided27() {
		try {
			assertEquals("0.0000333", Division.divided("0.00001", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided28() {
		try {
			assertEquals("-0.333", Division.divided("-1", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided29() {
		try {
			assertEquals("-0.333", Division.divided("1", "-3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided30() {
		try {
			assertEquals("0.333", Division.divided("-1", "-3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided31() {
		try {
			assertEquals("23300", Division.divided("7", "0.0003"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided32() {
		try {
			assertEquals("2330", Division.divided("7", "0.003"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided33() {
		try {
			assertEquals("233", Division.divided("7", "0.03"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided34() {
		try {
			assertEquals("23.3", Division.divided("7", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided35() {
		try {
			assertEquals("2.33", Division.divided("0.7", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided36() {
		try {
			assertEquals("0.233", Division.divided("0.07", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided37() {
		try {
			assertEquals("0.0233", Division.divided("0.007", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided38() {
		try {
			assertEquals("0.00233", Division.divided("0.0007", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided39() {
		try {
			assertEquals("0.000233", Division.divided("0.00007", "0.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided40() {
		StringBuilder sb = new StringBuilder().append("333");
		for (int i = 0; i < 997; i++) {
			sb.append("0");
		}
		try {
			assertEquals(sb.toString(), Division.divided("1E+1000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided41() {
		StringBuilder sb = new StringBuilder().append("0.");
		for (int i = 0; i < 1000; i++) {
			sb.append("0");
		}
		sb.append("333");
		try {
			assertEquals(sb.toString(), Division.divided("1E-1000", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided42() {
		StringBuilder sb = new StringBuilder().append("0.");
		for (int i = 0; i < 1000; i++) {
			sb.append("0");
		}
		sb.append("333");
		try {
			assertEquals(sb.toString(), Division.divided("1", "3E+1000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided43() {
		StringBuilder sb = new StringBuilder().append("333");
		for (int i = 0; i < 997; i++) {
			sb.append("0");
		}
		try {
			assertEquals(sb.toString(), Division.divided("1", "3E-1000"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided44() {
		StringBuilder sb = new StringBuilder().append("567");
		for (int i = 0; i < 97; i++) {
			sb.append("0");
		}
		try {
			assertEquals(sb.toString(), Division.divided("1.7E+100", "3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided45() {
		try {
			assertEquals("1.51", Division.divided("11", "7.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided46() {
		try {
			assertEquals("0.959", Division.divided("7", "7.3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided47() {
		try {
			assertEquals("0.996", Division.divided("7", "7.03"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided48() {
		try {
			assertEquals("0.00909", Division.divided("0.001", "0.11"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided49() {
		try {
			assertEquals("0.153", Division.divided("1.7E-3", "1.11E-2"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDivided50() {
		try {
			assertEquals("148", Division.divided("1.733E-3", "1.17E-5"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// SIGNIFICANT_DIGITS == 2 の場合
//	@Test
//	public void testDivided51() {
//		try {
//			assertEquals("0.33", Division.divided("1", "3"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
