public class Main {
    public static void main(String[] args) {
        String s = "from non static method";
        method2();
    }


    private static void method2() {
        String got = fnc_down();
        System.out.println(got);
    }

    private String fnc_down() {
        String s = "what! Not working??";
        return s;
    }

}