package pack;

abstract  class Person  {
    public String name;  //姓名


    public static Book[] books = new Book[]{  //默认定义书籍

            new Book("1-1",true),
            new Book("2-1",true),
            new Book("3-1",true),
            new Book("4-1",true),
            new Book()

    };

    public Person(String name) {
        this.name = name;
    }

    //get，set方法。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void operate();//抽象类中的抽象方法

}


