package tp2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinomioDeNewton {
	BinomioDeNewton b1;
	BinomioDeNewton b2;
	BinomioDeNewton b3;
	BinomioDeNewton b4;
	BinomioDeNewton b5;
	BinomioDeNewton b6;
	
	@Before
	public void setUp() {
		b1 = new BinomioDeNewton(1,1,2);   //x^2+2x+1
		b2 = new BinomioDeNewton(1,-3,5);  //x^5 - 15x^4 + 90x^3 - 270x^2 + 405x - 243
		b3 = new BinomioDeNewton(3,2,2);   // 9x^2 + 12x +4
		b4 = new BinomioDeNewton(2,-3,7);  // 128 x^7 - 1344 x^6 + 6048 x^5 - 15120 x^4 + 22680 x^3 - 20412 x^2 + 10206 x - 2187
		b5 = new BinomioDeNewton(-1,-4,9); // -x^9 - 36 x^8 - 576 x^7 - 5376 x^6 - 32256 x^5 - 129024 x^4 - 344064 x^3 - 589824 x^2 - 589824 x - 262144
		b6 = new BinomioDeNewton(-3,2,15); //-14348907 x^15 + 143489070 x^14 - 669615660 x^13 + 1934445240 x^12 - 3868890480 x^11 + 5674372704 x^10 - 6304858560 x^9 + 5404164480 x^8 - 3602776320 x^7 + 1868106240 x^6 - 747242496 x^5 + 226437120 x^4 - 50319360 x^3 + 7741440 x^2 - 737280 x + 32768
	}
	
	
	@Test
	public void queMuestreBienLosCoeficientes() {
		Assert.assertEquals(2, b1.obtenerCoeficiente(1), 0.001);
		Assert.assertEquals(-15, b2.obtenerCoeficiente(4),0.001);
		Assert.assertEquals(4, b3.obtenerCoeficiente(0),0.001);
		Assert.assertEquals(6048, b4.obtenerCoeficiente(5),0.001);
		Assert.assertEquals(-36, b5.obtenerCoeficiente(8),0.001);
		Assert.assertEquals(-14348907, b6.obtenerCoeficiente(15),0.001);
	}
}