fun main(args: Array<String>) {
    val cakes = listOf<String>("carrot", "cheese", "chocolate");

    for (cake in cakes) {
        println(cake);
    }

    println(cakes.joinToString());

    val zoo = Zoo(listOf(Animal("Lion"), Animal("Rabbit"), Animal("zebra")));

    for (animal in zoo) {
        println("${animal.name}");
    }
}

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator();
    }
}