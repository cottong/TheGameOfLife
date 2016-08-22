package gameOfLife;

public class GameOfLife2 {
	public static boolean LOD(boolean status, int numOfLivingNeighbors) {
		// inputs number of neighbors and state
		/*
		 * These are the rules 1. Any live cell with fewer than two live
		 * neighbours dies, as if caused by underpopulation. 2. Any live cell
		 * with more than three live neighbours dies, as if by overcrowding. 3.
		 * Any live cell with two or three live neighbours lives on to the next
		 * generation. 4. Any dead cell with exactly three live neighbours
		 * becomes a live cell.
		 * 
		 * Obviously this could be prettier (-_-)
		 */

		if (status == true) {
			if (numOfLivingNeighbors < 2) {
				status = false;
			} else if (numOfLivingNeighbors > 3) {
				status = false;
			}

		}

		if (status == false) {

			if (numOfLivingNeighbors == 3) {
				status = true;
			}
		}
		return status;

	}
}
