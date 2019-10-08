fun main() {
    var neverNull: String = "This can't be null"; // @NonNull
    // neverNull = null;

    var nullable: String? = "You can keep a null here"; // @Nullable
    nullable = null;

    var inferredNonNull = "The compiler assumes non-null";
    // inferredNonNull = null;

    println(describeString("kimbs"))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.isNotEmpty()) {
        return "String of length ${maybeString.length}";
    } else {
        return "Empty or null string";
    }
}