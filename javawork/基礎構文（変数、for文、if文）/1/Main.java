public class Main {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        System.out.println("Before: str1 = " + str1 + ", str2 = " + str2);

        // 値の入れ替え
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After: str1 = " + str1 + ", str2 = " + str2);
    }
}
