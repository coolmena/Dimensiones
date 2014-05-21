package Dimensiones;

public class Dimension4_tiempo extends Dimension3_profundidad
{
	
	/** Esta clase representa el tiempo, y nuestra interpretacion de este es siempre hacia delante. 
	
	//superposicion - cinta de moebius
		//se trata de hacer parecer a los seres de la tercera dimension (nosotros) que el tiempo que es relativo parece plano y lineal.
		private int caraA = duracion;
		private int caraB = caraA - 0;
		private int duracionMoebius= caraB - caraA;
	 * 
	 */
	
	public int duracion;

	public Dimension4_tiempo(int longitud, int anchura, int profundidad, int dur)
	{
		super(longitud, anchura, profundidad);
		this.duracion=dur;
	}

	public int getDuracion()
	{
		return duracion;
	}

	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
	}

	
	


}
