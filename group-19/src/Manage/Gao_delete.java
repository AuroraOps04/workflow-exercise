package Manage;

public class Gao_delete {
    //删除BOOK
    public void deleteBOOK() {
        System.out.println("--->删除书籍");
        System.out.print("请输入删除图书名称:");
        String name = input.next();
        int index = -1;
        for (BOOK d : book) {
            if (name.equals(d.getName())) {
                index = book.indexOf(d);
                if (d.getStatus().equals("已借出")) {
                    System.out.println("《" + name + "》" + "为借出状态，不能删除！");
                }
            }
        }
        if (index < 0)
            System.out.println("不存在该图书");
        else {
            book.remove(index);
            System.out.println("删除《" + name + "》成功!");
        }
    }
}
