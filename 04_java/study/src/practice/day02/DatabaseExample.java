package practice.day02;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = new Database();

        db.connect();
        System.out.println("데이터베이스: " + db.getInstance());
        db.close();
    }
}
