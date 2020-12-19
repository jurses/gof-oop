package gameoflife;

public class Cell extends UnicellularOrganism {
	private boolean alive;
	
	public void getNeighboring(UnicellularOrganism[] neighbors)
	{
		int neighbor_count = 0;
		for (int i = 0; i < neighbors.length; i++)
			if (neighbors[i].isAlive())
				neighbor_count++;
		
		determinateLife(neighbor_count);
	}
	
	public Cell()
	{
		super();
	}
	
	
	private void determinateLife(int neighbor_cont)
	{
		if (!alive && neighbor_cont == 3)
			alive = true;
		else if (alive && (neighbor_cont == 2 || neighbor_cont == 3))
			alive = true;
		else
			alive = false;
	}
}
