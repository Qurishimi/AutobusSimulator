import java.util.List;

public class Autobus implements Runnable {

	public String name;
	public Map map;
	public List<Przystanek> p;
	public int x;
	public int y;
	public int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Autobus(String name, int x, int y, Map map, List<Przystanek> p, int speed) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.map = map;
		this.p = p;
		this.speed = speed;
	}

	public boolean changePositionX(Przystanek p) {
		int i;
		
		if (this.y == p.y) {
		
			return false;
		}
		if (this.y < p.y)
			i = 1;
		else
			i = -1;
		this.map.map[this.x][this.y] = " ";
		this.map.map[this.x][this.y + i] = this.name;

		this.y = this.y + i;

		
		
		return true;
	}

	public boolean changePositionY(Przystanek p) {
		int i;
		
		if (this.x == p.x) {
		
			return false;
		}
		if (this.x < p.x)
			i = 1;
		else
			i = -1;
		this.map.map[this.x][this.y] = " ";
		this.map.map[this.x + i][this.y] = this.name;

		this.x = this.x + i;

		
		
		return true;
	}

	@Override
	public void run() {
		boolean con = true;
		boolean con1 = true;
		for (int i = 0; i < this.p.size(); i++) {
			while (con || con1) {
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				con = changePositionX(this.p.get(i));
				con1 = changePositionY(this.p.get(i));
			}
			con = true;
		/*	while (con) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				con = changePositionY(this.p.get(i));

			}
			con = true;

		}
		*/
		}
		}

}
