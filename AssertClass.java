package testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class AssertClass {
@Test
public void test() {
	String str1=new String("Virtusa");
	String str2="Virtusa";
	int val1=2;
	int val2=5;
	String str3=null;
	assertNotNull(str2);
	assertTrue(val1<val2);
	assertEquals(str1,str2);
	assertFalse(val1>val2);
	assertNull(str3);
}
}
