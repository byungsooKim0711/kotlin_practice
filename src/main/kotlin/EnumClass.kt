enum class State {
    START, STOP, BLOCKED, RUNNABLE, RUNNING;
}

enum class Color(private val rgb: Int) {
      RED(0xFF0000)
    , GREEN(0x00FF00)
    , BLUE(0x0000FF)
    , YELLOW(0xFFFF00);

    fun containsRed() = this.rgb and 0xFF0000 != 0;
    fun containsGreen() = this.rgb and 0x00FF00 != 0;
    fun containsBlue() = this.rgb and 0x0000FF != 0;
    fun containsYellow() = this.rgb and 0xFFFF00 != 0;
}

fun main() {
    val message = when (State.BLOCKED) {
        State.START -> "It's start";
        State.STOP -> "It's stop";
        State.BLOCKED -> "It's blocked";
        State.RUNNABLE -> "It's runnable";
        State.RUNNING -> "It's running";
    }

    println(message);

    val red = Color.RED;
    println(red);
    println(red.containsRed());
    println(Color.GREEN.containsRed());
    println(Color.RED.containsGreen());
    println(Color.BLUE.containsBlue());
    println(Color.YELLOW.containsYellow());
}