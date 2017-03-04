package sdajava.varargs;

public class Main {

    public static String funkcja(int index, String... others) {
        return others[index];
    }


    public static void main(String[] args)
    {
        System.out.println(funkcja(4,"kot", "pies", "samolot"));
    }
}
