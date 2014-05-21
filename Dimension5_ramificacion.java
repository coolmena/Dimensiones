package Dimensiones;
import java.util.Random;

public class Dimension5_ramificacion 
{
	/** Esta dimension representa las posibilidades que puede haber tomado en el tiempo (Clase 4) un objeto 3D (Dimension3) 
	 	Esta basada en infinitas ramas con una probabilidad	y la cantidad de estas ramas se dice que es infinita (Dimension6) */
	
	int numeroRamas;
	Rama ramificacion[];
	
	//Ejemplos:
//	private Rama Rama1 = new Rama(20,20,20,5,100); 	// Cubo de 20, durante 5 
//	private Rama Rama2 = new Rama(20,10,5,5,100);	// Rectangulo
	
	public Dimension5_ramificacion(int numeroRamas)
	{
		int long_al, anch_al, prof_al, dura_al;
		int probabilidad; // Est se generaría de una ecuación que calcule si la forma es posible, pero aki haremos una media
		
		ramificacion = new Rama [numeroRamas];

		for (int cont = 0; cont < ramificacion.length; cont++)
		{
			long_al = (int) Math.floor(Math.random()*(100-0+1)+100);
			anch_al = (int) Math.floor(Math.random()*(100-0+1)+100);
			prof_al = (int) Math.floor(Math.random()*(100-0+1)+100);
			dura_al = (int) Math.floor(Math.random()*(60-0+1)+60);	// 86400segundos tiene un dia //
			
			// Este se generaría de una ecuación que calcule si la forma es posible, pero aki haremos una media
			probabilidad = (long_al + anch_al + prof_al + dura_al)/4;
			
		
			ramificacion[cont] = new Rama(long_al, anch_al, prof_al, dura_al, probabilidad);
			System.out.println("Generada ramificacion: "+(cont+1)+" valores: "
					+ "\n\t Long: "+long_al+", Anch:"+anch_al+", Prof: "+prof_al+",Dura:"+ dura_al+", Prob: "+probabilidad);
		}
	}
	
	// Ric - porque no salen los mismos resultados?
	public String toString()
	{
		String Salida = "Lectura de ramificacion de la 5 dimension : \n";
		
		for (int cont = 0; cont < ramificacion.length; cont++)
		{
			Salida += "\n Ramificacion: "+(cont+1)+" valores: ";
			Salida += "\n\t Long: "+ramificacion[cont].getLongitud()+", Anch:"+ramificacion[cont].getAnchura()+", Prof: "+ramificacion[cont].getProfundidad()+
					   "\n\t Dura:"+ ramificacion[cont].getDuracion()+", Prob: "+ramificacion[cont].getProbabilidad();
		}
		return Salida;				
	}
	
		
	public int getNumeroRamas()
	{
		return numeroRamas;
	}

	public void setNumeroRamas(int numeroRamas)
	{
		this.numeroRamas = numeroRamas;
	}
	
	public class Rama extends Dimension4_tiempo
	{
		int probabilidad;

		public Rama(int longitud, int anchura, int profundidad, int dur, int prob)
		{
			super(longitud, anchura, profundidad, dur);
			this.probabilidad = prob;
		}

		public int getProbabilidad()
		{
			return probabilidad;
		}

		public void setProbabilidad(int probabilidad)
		{
			this.probabilidad = probabilidad;
		}	
	}

	
	public static void main(String[] args)
	{
		Dimension5_ramificacion a = new Dimension5_ramificacion(6);
		
		System.out.println(a.toString());
	}
	

	
}
