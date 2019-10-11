data class User(val name: String, val id: Int, val email: String)

fun main() {
    val user = User("Kimbs", 1, "email1");
    println(user);

    val secondUser = User("Kimbs", 1, "email1");
    val thirdUser = User("Alex", 2, "email2");

    println("user == secondUser : ${user == secondUser}")
    println("user == thirdUser : ${user == thirdUser}")

    println(user.copy("copy"));

    println("name = ${user.component1()}");
    println("name = ${user.component2()}");
    println("name = ${user.component3()}");
}