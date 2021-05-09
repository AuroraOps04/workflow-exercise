package BookManager;

import java.text.ParseException;

public class Client {
    public static void main(String[] args) {
        Menu menu=new Menu();
        try {
            menu.loadMenu();//实现菜单
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
