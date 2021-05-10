package bk;

import java.util.ArrayList;
import java.util.Scanner;

public class deletebook {
    public void deletebook(ArrayList<Book> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的图书id");
        String id = sc.nextLine();
        for(int i=0;i<arr.size();i++){
            Book b = arr.get(i);
            if(id.equals(b.getId())){
                arr.remove(i);
                break;
            }

        }

    }
}
