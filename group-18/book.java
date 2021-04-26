public class recommend {

    public static void recommend(ArrayList<Book> arr) {
        int randomNumber = new Random().nextInt(arr.size());
        System.out.println("id\t\tÊéÃû");
        Book b = arr.get(randomNumber);
        System.out.println(b.getId() + "\t\t" + b.getName());
    }
}
