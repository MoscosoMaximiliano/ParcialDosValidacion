import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


import org.junit.jupiter.api.Test;

class Ecuacion_JUnit {

	public Ecuacion_JUnit() {
	}
	
	@Test
	void Test1() throws Exception
	{
		Ecuacion ecuacion1 = new Ecuacion(1);
		
		assertEquals(4.0, ecuacion1.Cuadratica(-2));
	}
	@Test
	void Test2() throws Exception
	{
		Ecuacion ecuacion2 = new Ecuacion(3, 6);
		
		assertEquals(0.0, ecuacion2.Cuadratica(0));
	}
	@Test
	void Test3() throws Exception
	{
		Ecuacion ecuacion3 = new Ecuacion(7, 2, 9);
		
		assertEquals(18.0, ecuacion3.Cuadratica(1));
	}
	@Test
	void Test4() throws Exception
	{
		Ecuacion ecuacion4 = new Ecuacion(-1);
		
		//Se busca la excepción ya que en una raiz A no puede ser un número negativo
		assertThrows(Exception.class, () -> ecuacion4.Raiz(3));
	}
	@Test
	void Test5() throws Exception
	{
		Ecuacion ecuacion5 = new Ecuacion(7, 5); 
		
		
		//Se cambia el formato del valor
		DecimalFormat df = new DecimalFormat("#.#######");
	    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();

	    //Por defecto double utiliza la coma y acá se cambia por el . para que coincida con el resultado
	    dfs.setDecimalSeparator('.');
	    df.setDecimalFormatSymbols(dfs);
	    
	    String expectedValue = "-15.2915026";
		
		assertEquals(expectedValue, df.format(ecuacion5.Raiz(-2)));
	}
	@Test
	void Test6() throws Exception
	{
		Ecuacion ecuacion6 = new Ecuacion(3, -2, 0);
		
		assertEquals(0.0, ecuacion6.Raiz(0));
	}
	
	

}
