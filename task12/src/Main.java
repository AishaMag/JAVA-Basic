public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        if ((str.contains("Java")) && (str.startsWith("I like")) && (str.endsWith("!!!")))
            System.out.println(str.toUpperCase());

        System.out.println(str.substring(7,8)+'o'+str.substring(9,10)+'o');
    }
}