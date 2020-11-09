
public class Ecuacion {
	
	private double a;
	private double b;
	private double c;
	
	public Ecuacion(double a)
	{
		this.a = a;
	}
	
	public Ecuacion(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public Ecuacion(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Cuadratica(double x) throws Exception
	{
		//Para que una ecuacion sea cuadratica el valor de A no puede ser 0
		if(this.a != 0)
		{
			double p1 = this.a * Math.pow(x, 2);
			double p2 = x * this.b;
			double p3 = this.c;
			
			return p1 + p2 + p3;
		}
		else
			throw new Exception("El valor de A no puede ser 0");
		
		

	}
	
	
	public double Raiz(double x) throws Exception
	{	
		//No se puede hacer la raiz de 0 o de un número negativo
		if(this.a >= 0)
		{
			double p1 = x * Math.sqrt(this.a);
			double p2 = x * this.b;
			double p3 = this.c;
			
			return p1 + p2 + p3;
		}
		else
			throw new Exception("El valor de A no puede ser menor de 0");
		
		

	}
}
