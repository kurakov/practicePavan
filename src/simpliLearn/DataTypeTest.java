  package simpliLearn;

public class DataTypeTest {

	public static void main(String[] args) {
		byte var_byte=10; //byte is 1 byte : -128 to 127
		short var_short= 15; //short is 2 bytes: -32788 to +32766
		
		int var_unt = 40000; // 4 bytes
		
		float var_float=0.45f; //8 bytes
		float var_float2=(float)0.45; //8 bytes

		double var_double=23.3444434; //8 bytes - high precision calculation
		
		
		char var_char='A';//2 bytes
		
		//it store as 16-bit unicode UTF16
		
		char var2 =  '\u4436';
		
		Boolean var_bol=true;//1 bit
		Boolean var_bol1=false;//1 bit
		
		Integer myInt=new Integer(500);
		System.out.println(myInt.intValue());
		
		System.out.println(var2);
		
		
	}

}
