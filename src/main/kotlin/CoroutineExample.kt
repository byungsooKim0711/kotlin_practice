/*
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred

data class Member(var email: String, var id: Int)

// Use authentication service:
fun login(email: String): Deferred<Int> {
    val deferred = CompletableDeferred<Int>()
    deferred.complete(100);
    return deferred;
}

// Send a request to a remote database
fun load(id: Int): Deferred<Member> {
    val deferred = CompletableDeferred<Member>()
    val member = Member("vlakd0711@naver.com", 100);
    deferred.complete(member);
    return deferred;
}

// Show the results
fun show(member: Member) {
    println(member);
}

suspend fun showMember(email: String) {
    val id = login(email).await();
    val member = load(id).await();
    show(member);
}

fun main() {
    showMember("kimbs");
}
*/
