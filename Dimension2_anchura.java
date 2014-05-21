package Dimensiones;

public class Dimension2_anchura extends Dimension1_longitud 
{
	
	private int anchura;
	Punto tres;
	
	
	public Dimension2_anchura(int longitud, int anchura)
	{
		super(longitud);
		tres = new Punto(anchura);
	}


	public int getAnchura()
	{
		return anchura;
	}


	public void setAnchura(int anchura)
	{
		this.anchura = anchura;
	}
	
	
	
	
}
