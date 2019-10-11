fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain");
    val writers = setOf("Twain", "Shakespeare", "Hemingway");

    // ignore element order.
    println(authors == writers);
    println(authors.equals(writers));

    println(authors === writers);
}