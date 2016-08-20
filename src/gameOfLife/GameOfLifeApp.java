package gameOfLife;

public class GameOfLifeApp {

	public static String GOLProcessor(int x, int y) {

		String LODArray[][] = { { ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", "*", ".", ".", "." },
				{ ".", ".", ".", "*", "*", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", "." } };
		/*These are the rules
		 * 1. Any live cell with fewer than two live neighbours dies, as if
		 * caused by underpopulation. 
		 * 2. Any live cell with more than three live neighbours dies, 
		 * as if by overcrowding. 
		 * 3. Any live cell with two or three live neighbours lives on to the 
		 * next generation. 
		 * 4. Any dead cell with exactly three live neighbours becomes a live cell.
		 * 
		 * Obviously this could be prettier (-_-)
		 */
		int counter = 0;
		String state = "";
		// Check Top left Corner
		if (x == 0 && y == 0) {
			
			if (LODArray[x][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y + 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// Check Bottom Left Corner

		if (x == LODArray.length - 1 && y == 0) {

			if (LODArray[x - 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y + 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// Check Top Right Corner

		if (x == 0 && y == LODArray[0].length - 1) {

			if (LODArray[x][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// Check Bottom Right Corner

		if (x == LODArray.length - 1 && y == LODArray[0].length - 1) {

			if (LODArray[x - 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y - 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}

		// Check Top side
		if (x == 0) {

			if (LODArray[x][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y - 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// Check Bottom side
		if (x == LODArray.length - 1) {

			if (LODArray[x - 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x][y - 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// check left side
		if (y==0) {

			if (LODArray[x - 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y + 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y + 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		// check right side
		if (y == LODArray[0].length - 1) {

			if (LODArray[x - 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y].equals("*")) {
				counter++;
			}
			if (LODArray[x][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x - 1][y - 1].equals("*")) {
				counter++;
			}
			if (LODArray[x + 1][y - 1].equals("*")) {
				counter++;
			}
			if (counter < 2) {
				state = ".";
			}
			if (counter > 3) {
				state = ".";
			}
			if (counter == 3) {
				state = "*";
			}
			if (LODArray[x][y].equals("*") && counter ==2){
				state = "*";
			}
			if (LODArray[x][y].equals(".") && counter ==2){
				state = ".";
			}
			return state;
		}
		//middle cells
		if (LODArray[x - 1][y].equals("*")) {
			counter++;
		}
		if (LODArray[x + 1][y].equals("*")) {
			counter++;
		}
		if (LODArray[x][y - 1].equals("*")) {
			counter++;
		}
		if (LODArray[x - 1][y - 1].equals("*")) {
			counter++;
		}
		if (LODArray[x + 1][y - 1].equals("*")) {
			counter++;
		}
		if (LODArray[x + 1][y + 1].equals("*")) {
			counter++;
		}
		if (LODArray[x][y + 1].equals("*")) {
			counter++;
		}
		if (LODArray[x-1][y + 1].equals("*")) {
			counter++;
		}
		if (counter < 2) {
			state = ".";
		}
		if (counter > 3) {
			state = ".";
		}
		if (counter == 3) {
			state = "*";
		}
		if (LODArray[x][y].equals("*") && counter ==2){
			state = "*";
		}
		if (LODArray[x][y].equals(".") && counter ==2){
			state = ".";
		}

		return state;
	}

}
