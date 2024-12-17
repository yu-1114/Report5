public class rp1_1 {
    public static void main(String[] args) {
        String str;
        str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}