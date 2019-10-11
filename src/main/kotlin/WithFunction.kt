fun main() {
    val sb = StringBuilder();

    val str = with(sb) {
        appendln("Alphabet: ");
        for (c in 'a'..'z') {
            append(c);
        }
        toString();
    }
    println(str);
}