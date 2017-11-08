import java.util.ArrayList;
import java.util.List;

public class Map {

	String[][] map;

	
	
	
	public void setMap(String[][] map) {
		this.map = map;
	}



	public String[][] getMap() {
		return map;
	}



	public void createMap(int x, int y) {
		String[][] map = new String[x][y];;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				map[i][j] = " ";
			}
		}
		this.map = map;
	}

	

	public void addPrzystanek(Przystanek p1) {
		
		this.map[p1.getX()][p1.getY()] = p1.getName() + "=" + p1.people;
		
		
	}

public void addAutobus(Autobus a1) {
		
		this.map[a1.getX()][a1.getY()] = a1.getName();
		
		
	}

	public void printMap()  {
	
		String printLine = "";
		for (int i = 0; i < map.length; i++) {
			for (int y = 0; y < map[i].length; y++) {
				printLine += map[i][y];
			}
			printLine += "\n" ;
		}
		
		System.out.println(printLine);
		 
	}

}
