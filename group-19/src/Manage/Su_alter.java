package Manage;
import java.util.Scanner;
//�޸��鼮
public class Su_alter {
    Scanner input = new Scanner(System.in);
    public void alterBOOK() {
        BOOK ddd = new BOOK();
        System.out.println("--->�޸�BOOK");
        System.out.println("������Ҫ�޸ĵ�ͼ�����ƣ�");
        String name7 = input.next();
        int i = -1;
        for (BOOK d : book) {
            if (name7.equals(d.getName())) {
                System.out.println("��������Ҫ����ͼ���id��");
                int id = input.nextInt();
                ddd.setId(id);
                System.out.println("��������Ҫ����ͼ������ƣ�");
                String name = input.next();
                ddd.setName(name);
                System.out.println("��������Ҫ����BOOK�Ľ�������");
                String t = input.next();
                ddd.setStatus(t);
                System.out.println("��������Ҫ����BOOK�Ľ��ʱ�䣺");
                String time = input.next();
                ddd.setBorrowTime(time);
                book.set(book.indexOf(d),ddd);

            }
        }
    }
}
