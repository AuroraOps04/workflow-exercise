package Manage;
//新增书籍
public class zeng_add {
    public void addBOOK() {
        System.out.println("--->新增书籍");
        System.out.print("请输入图书名称:");
        String name = input.next();
        int i = -1;
        for (BOOK d : book) {
            if (name.equals(d.getName())) {
                System.out.println("图书已存在，不能再添加该书籍！");
                i = book.indexOf(d);
            }
        }
        if (i < 0) {
            book.add(new BOOK(book.size() + 1, name, "可借", ""));
            System.out.println("新增《" + name + "》成功!");
        }
    }
}
