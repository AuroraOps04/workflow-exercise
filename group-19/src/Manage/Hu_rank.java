package Manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hu_rank {
    // 推荐书籍
    public void BOOKRank() {
        System.out.println("--->推荐书籍");
        System.out.println( "    名称");
        List<BOOK> books = new ArrayList<BOOK>();
        books.addAll(bkk);
        Collections.sort(books);
        Collections.reverse(books);
        for (BOOK d : books) {
            System.out.println("《" + d.getName() + "》");
        }
    }
}
