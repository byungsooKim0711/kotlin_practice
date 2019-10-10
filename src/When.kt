fun main() {

    println(cases("Hello"));
    println(cases(1));
    println(cases(1234L));
    println(cases(100));
    println(cases(MyClass()));
}

fun cases(obj: Any): String {
    return when (obj) {
        1 -> "One";
        "Hello" -> "Greeting";
        is Long -> "Long";
        !is String -> "Not a String";
        else -> "Unknown";
    }
}

class MyClass