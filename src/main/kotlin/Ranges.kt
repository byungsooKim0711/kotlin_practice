fun main(args: Array<String>) {

    for (i in 0..3) {
        print(i);
    }

    println();
    
    for (i in 2..8 step 2) {
        print(i);
    }

    println();

    for (i in 3 downTo 0) {
        print(i);
    }

    println();

    val x = 2;
    if (x in 1..10) {
        println(x);
    }

    if (x !in 1..4) {
        println(x);
    }
}