package Dimensiones;
public class Dimension1_longitud	// La primera dimension representa la longitud entre dos puntos (linea)
{
	//Objetos 
	int Longitud;
	
	private Punto uno;
	private Punto dos;
	
	public Dimension1_longitud(int longitud)
	{
		Punto uno = new Punto(0);
		Punto dos = new Punto(longitud);
	}
	
	public int getLongitud()
	{
		return Longitud;
	}

	public void setLongitud(int distancia)
	{
		Longitud = distancia;
	}
	

/////////////////////////////////////////////////////////////////////////
	class Punto	// clase anidada que representa un punto
	{
		private int valor;
		
		public Punto(int valor)
		{
			this.valor=valor;
		}

		public int getValor()
		{
			return valor;
		}

		public void setValor(int valor)
		{
			this.valor = valor;
		}		
	}
/////////////////////////////////////////////////////////////////////////////	
}

