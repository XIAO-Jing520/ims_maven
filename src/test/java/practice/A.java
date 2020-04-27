package practice;

public class A {
    public static void main(String[] args) {
        String sql="from user";
        int index =sql.toLowerCase().indexOf("user");
        System.out.println(index);
    }
}
