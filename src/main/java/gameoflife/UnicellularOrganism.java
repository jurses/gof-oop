package gameoflife;

public abstract class UnicellularOrganism {

	public abstract void getNeighboring(UnicellularOrganism[] neighbors);
	
	protected boolean alive;
	protected Position pos;
	
	public void offset(int offset_x, int offset_y)
	{
		pos.x += offset_x;
		pos.y += offset_y;
	}
	
	public UnicellularOrganism() {
		pos = new Position();
		alive = true;
	}
	
	
	public boolean isAlive()
	{
		return alive;
	}
	
	
}
