import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) throws InterruptedException, IOException {

		Map map = new Map();
		map.createMap(10, 80);

		Przystanek A = new Przystanek("A", 1, 16, 4);
		Przystanek B = new Przystanek("B", 6, 50, 2);
		Przystanek C = new Przystanek("C", 9, 65, 1);
		Przystanek D = new Przystanek("D", 8, 2, 3);
		Przystanek E = new Przystanek("E", 3, 1, 6);
		Przystanek F = new Przystanek("F", 5, 16, 1);

		map.addPrzystanek(A);
		map.addPrzystanek(B);
		map.addPrzystanek(C);
		map.addPrzystanek(D);
		map.addPrzystanek(E);
		map.addPrzystanek(F);

		List<Przystanek> route = new ArrayList<Przystanek>();

		route.add(A);
		route.add(C);
		route.add(B);
		route.add(A);
		route.add(C);
		route.add(B);
		route.add(A);
		route.add(C);
		route.add(B);

		List<Przystanek> route2 = new ArrayList<Przystanek>();

		route2.add(C);
		route2.add(B);
		route2.add(A);

		List<Przystanek> route3 = new ArrayList<Przystanek>();

		route3.add(F);
		route3.add(B);
		route3.add(E);
		route3.add(F);
		route3.add(B);
		route3.add(E);
		route3.add(F);
		route3.add(B);
		route3.add(E);
		route3.add(F);
		route3.add(B);
		route3.add(E);
		route3.add(F);
		route3.add(B);
		route3.add(E);

		List<Przystanek> route4 = new ArrayList<Przystanek>();

		route4.add(C);
		route4.add(B);
		route4.add(D);
		route4.add(F);
		route4.add(A);
		route4.add(C);
		route4.add(B);
		route4.add(D);
		route4.add(F);
		route4.add(A);

		Runnable autobus1 = new Autobus("A1", 0, 0, map, route, 1000);
		Runnable autobus2 = new Autobus("A2", 3, 7, map, route, 500);
		Runnable autobus3 = new Autobus("A3", 8, 26, map, route2, 2000);
		Runnable autobus4 = new Autobus("A4", 8, 26, map, route3, 100);
		Runnable autobus5 = new Autobus("A5", 1, 1, map, route4, 40);

		Thread thread1 = new Thread(autobus1);

		Thread thread2 = new Thread(autobus2);
		Thread thread3 = new Thread(autobus3);
		Thread thread4 = new Thread(autobus4);

		Thread thread5 = new Thread(autobus5);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		while (true) {
			System.out.println("  ");
			System.out.println("  ");
			map.printMap();

			map.map[A.x][A.y] = A.name + "=" + A.people;
			map.map[B.x][B.y] = B.name + "=" + B.people;
			
			map.map[C.x][C.y] = C.name + "=" + C.people;
			
			map.map[D.x][D.y] = D.name + "=" + D.people;
			
			map.map[E.x][E.y] = E.name + "=" + E.people;
			
			map.map[F.x][F.y] = F.name + "=" + F.people;
			

			Thread.sleep(100);

		}
	}
}
