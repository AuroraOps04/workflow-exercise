package Manage;
//�����鼮
public class zeng_add {
    public void addBOOK() {
        System.out.println("--->�����鼮");
        System.out.print("������ͼ������:");
        String name = input.next();
        int i = -1;
        for (BOOK d : book) {
            if (name.equals(d.getName())) {
                System.out.println("ͼ���Ѵ��ڣ���������Ӹ��鼮��");
                i = book.indexOf(d);
            }
        }
        if (i < 0) {
            book.add(new BOOK(book.size() + 1, name, "�ɽ�", ""));
            System.out.println("������" + name + "���ɹ�!");
        }
    }
}
