data class Vendor(var name: String, var id: Long)

fun main() {

    val vendor = Vendor("kimbs", 1);
    println(vendor);

    val obj = vendor?.apply {
        name = "apply";
        id = 999;
    } ?: return

    println(obj);
    println(vendor);
}