package Dimensiones;

public class Dimension3_profundidad extends Dimension2_anchura
{
	Punto cuatro;
	int profundidad;

	public Dimension3_profundidad(int longitud, int anchura, int profundidad)
	{
		super(longitud, anchura);
		this.profundidad = profundidad;
	}

	public int getProfundidad()
	{
		return profundidad;
	}

	public void setProfundidad(int profundidad)
	{
		this.profundidad = profundidad;
	}
	
}
