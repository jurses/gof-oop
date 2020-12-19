package culture;

import gameoflife.UnicellularOrganism;

public class Culture{
	private UnicellularOrganism culture_matrix[][];
	
	public Culture(int w, int h)
	{
		culture_matrix = new UnicellularOrganism[w][h];
	}
	
	public void nextIteration()
	{
		UnicellularOrganism[][] new_culture = new UnicellularOrganism[culture_matrix.length][culture_matrix[0].length];
	}
}
