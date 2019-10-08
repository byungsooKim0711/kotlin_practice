class Person(val id: Int, var name: String, var phone: String) {

    override fun toString(): String {
        return "Person(id=$id, name=$name, phone=$phone)";
    }
}

class Customer {
    private var id: Int;
    private var name: String;
    private var phone: String;

    init {
        id = -1;
        name = "";
        phone = "";
    }

    public fun setName(name: String) {
        this.name = name;
    }

    public fun getName() = this.name;

    public fun setPhone(phone: String) {
        this.phone = phone;
    }

    constructor(id: Int) {
        this.id = id;
    }

    constructor() {}

    constructor(id: Int, name: String) {
        this.id = id;
        this.name = name;
    }

    constructor(id: Int, name: String, phone: String) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    override fun toString(): String {
        return "Customer(id=$id, name=$name, phone=$phone)";
    }
}

fun main() {
    val kbs = Person(1, "kbs", "010-0000-0000");
    val lee = Person(name = "lee", id = 2, phone = "010-1111-1111");
    println(kbs);
    println(lee);

    val customer = Customer(100, "kotlin");
    customer.setName("change name");
    customer.setPhone("010-9999-9999");
    println(customer);

}