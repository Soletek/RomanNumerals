import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestRomanNumerals {

	RomanNumerals romanNumerals;
	
	@Before
	public void initialize() {
		romanNumerals = new RomanNumerals();
	}
	
	@Test
	public void test_empty_string_equals_0() {
		assertRomanNumToBe(0, "");
	}
	
	@Test
	public void test_I_equals_1() {
		assertRomanNumToBe(1, "I");
	}

	@Test
	public void test_II_equals_2() {
		assertRomanNumToBe(2, "II");
	}
	
	@Test
	public void test_III_equals_3() {
		assertRomanNumToBe(3, "III");
	}
	
	@Test
	public void test_IV_equals_4() {
		assertRomanNumToBe(4, "IV");
	}
	
	@Test
	public void test_V_equals_5() {
		assertRomanNumToBe(5, "V");
	}
	
	@Test
	public void test_VI_equals_6() {
		assertRomanNumToBe(6, "VI");
	}
	
	@Test
	public void test_VII_equals_7() {
		assertRomanNumToBe(7, "VII");
	}
	
	@Test
	public void test_VIII_equals_8() {
		assertRomanNumToBe(8, "VIII");
	}
	
	@Test
	public void test_IX_equals_9() {
		assertRomanNumToBe(9, "IX");
	}
	
	@Test
	public void test_XXIV_equals_24() {
		assertRomanNumToBe(24, "XXIV");
	}

	@Test
	public void test_X_equals_10() {
		assertRomanNumToBe(10, "X");
	}
	
	@Test
	public void test_L_equals_50() {
		assertRomanNumToBe(50, "L");
	}
	
	@Test
	public void test_XCVIII_equals_98() {
		assertRomanNumToBe(98, "XCVIII");
	}
	
	@Test
	public void test_XCIX_equals_99() {
		assertRomanNumToBe(99, "XCIX");
	}
	
	@Test
	public void test_C_equals_100() {
		assertRomanNumToBe(100, "C");
	}
	
	@Test
	public void test_D_equals_500() {
		assertRomanNumToBe(500, "D");
	}
	
	@Test
	public void test_DLV_equals_555() {
		assertRomanNumToBe(555, "DLV");
	}
	
	@Test
	public void test_M_equals_1000() {
		assertRomanNumToBe(1000, "M");
	}
	
	@Test
	public void test_MI_equals_1001() {
		assertRomanNumToBe(1001, "MI");
	}
	
	@Test
	public void test_MCMLXXXIV_equals_1984() {
		assertRomanNumToBe(1984, "MCMLXXXIV");
	}
	
	@Test
	public void test_MMXIV_equals_2014() {
		assertRomanNumToBe(2014, "MMXIV");
	}
	
	@Test
	public void test_MMMCCCXXXIII_equals_3333() {
		assertRomanNumToBe(3333, "MMMCCCXXXIII");
	}
	
	@Test
	public void test_MMMCMXCIX_equals_3999() {
		assertRomanNumToBe(3999, "MMMCMXCIX");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IIII_throws() {
		assertRomanNumToBe(-1, "IIII");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IIV_throws() {
		assertRomanNumToBe(-1, "IIV");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IIIV_throws() {
		assertRomanNumToBe(-1, "IIIV");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IVI_throws() {
		assertRomanNumToBe(-1, "IVI");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_VX_throws() {
		assertRomanNumToBe(-1, "VX");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_VV_throws() {
		assertRomanNumToBe(-1, "VV");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_VL_throws() {
		assertRomanNumToBe(-1, "VL");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_VC_throws() {
		assertRomanNumToBe(-1, "VC");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IM_throws() {
		assertRomanNumToBe(-1, "IM");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_XLX_throws() {
		assertRomanNumToBe(-1, "XLX");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_IXC_throws() {
		assertRomanNumToBe(-1, "IXC");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_CDC_throws() {
		assertRomanNumToBe(-1, "CDC");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_LXIXIX_throws() {
		assertRomanNumToBe(-1, "LXIXIX");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_ICVLX_throws() {
		assertRomanNumToBe(-1, "ICVLX");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_illegal_characters_throws() {
		assertRomanNumToBe(-1, "HELLO!");
	}
	
	// Using this helper method reduces repetition in test cases
	private void assertRomanNumToBe(int expected, String romanNum) {
		int result = romanNumerals.convertToInteger(romanNum);
		assertEquals(expected, result);
	}
}
