package Manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hu_rank {
    // �Ƽ��鼮
    public void BOOKRank() {
        System.out.println("--->�Ƽ��鼮");
        System.out.println( "    ����");
        List<BOOK> books = new ArrayList<BOOK>();
        books.addAll(bkk);
        Collections.sort(books);
        Collections.reverse(books);
        for (BOOK d : books) {
            System.out.println("��" + d.getName() + "��");
        }
    }
}
