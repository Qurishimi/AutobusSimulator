
public class Przystanek {

	public String name;
	public int x;
	public int y;
	public int people;

	
	
	public Przystanek(String name, int x, int y, int people) {
	
		this.name = name;
		this.x = x;
		this.y = y;
		this.people = people;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
