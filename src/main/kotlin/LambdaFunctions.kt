fun main() {
    val upperCase1: (String) -> String = {
        str: String -> str.toUpperCase();
    }

    val upperCase2: (String) -> String = {
        str -> str.toUpperCase();
    }

    val upperCase3 = {
        str: String -> str.toUpperCase();
    }

    val upperCase4: (String) -> String = {
        it.toUpperCase();
    }

    val upperCase5: (String) -> String = String::toUpperCase;

    println(upperCase1("hello"));
    println(upperCase2("hello"));
    println(upperCase3("hello"));
    println(upperCase4("hello"));
    println(upperCase5("hello"));
}