public class Main {
    public static void main(String[] args) {
//        String url="jdbc:mysql://115.159.41.241:3306";
//        String user="user211814405";
//        String password="211814405";

        String url = "jdbc:mysql://localhost:3306/211814405db";
        String user="root";
        String password="123";

        ConSql c = new ConSql();

        c.conSql(url,user,password);
        System.out.println(c.conSql(url,user,password));
//        c.SearchSql("麦田里的守望者");
    }
}
