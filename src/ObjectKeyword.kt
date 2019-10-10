fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDays;
        var festivity: Int = 50 * festivityDays;
        var special: Int = 100 * specialDays;
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special;

    println("Total price: $$total");
}

class BigBen {
    //
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("Bong ");
            }
        }
    }
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("Input Auth parameters = $username:$password");
    }
}

fun main() {
    rentPrice(10, 2, 1);

    DoAuth.takeParams("foo", "foo")

    BigBen.Bonger.getBongs(10);
}