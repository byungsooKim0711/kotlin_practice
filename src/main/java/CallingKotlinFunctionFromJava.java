public class CallingKotlinFunctionFromJava {
    public static void main(String... args) {
        char c = LastCharKt.lastChar("kimbs");
        System.out.println(c);
    }
}
