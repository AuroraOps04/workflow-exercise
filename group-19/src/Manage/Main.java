package Manage;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Menu menu = new Menu();
			Shop shop = new Shop();
			shop.initialBOOK();
			menu.start(shop);		
	}
}
