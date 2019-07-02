import com.kaczurba.Triangle
import java.awt.Rectangle

val PI = 3.1415;

fun main() {
    println("First string.");
    println("Sum of 2 + 5: " + sum(2, 5));
    println("NoMeaningFul Sum of 2 + 5: " + sum(2, 5));
    defineVars();

    // String templates:
    val a = 5.3;
    val b : Int;
    val c = "Whatever";
    b = 9;
    println("String templates $a, $b, $c; PI=$PI");
    println("Max of -5, -6 = ${maxOf(-5, -6)} ");
    println("MinA of 5, 6 = ${minOfA(5, 6)}");
    println("MinB of 5, 6 = ${minOfB(5, 6)}");
    println("parseInt(4) : ${toInt("4")}");
    println("parseInt(\"\") : ${toInt("ss")}");
    println("typeChecks(\"abc\") : ${typeChecks("abc")}");
    println("typeChecks(5) : ${typeChecks(5)}");

    // loop:
    var itemList = listOf("Apple", "Banana", "kwifif")
    for (item in itemList) { // NOTE: It is "in" and not ":";
        println(item);
    }

    println("Indices of a list: itemList.indices");
    for (index in itemList.indices) {
        print(" $index ");
    }

    var items = listOf("apple", "banana", "kdasdf");
    println("\nRanges:");
    var index = 0;
    while (index < items.size) {
        println("items at $index is ${items[index]}");
        index++;
    }

    // TODO: When expressions: from https://kotlinlang.org/docs/reference/basic-syntax.html

    // TODO: Using ranges from https://kotlinlang.org/docs/reference/basic-syntax.html

    // TODO: Using collections from https://kotlinlang.org/docs/reference/basic-syntax.html

    // TODO: Using lambda expressions to filter and map collections.


    // Creating basic classes and their instances:
    var rectangle = Rectangle(2, 2, 3, 3);
    var triangle = Triangle(.0, 4.0, 5.0);
}

fun sum(a : Int, b : Int) : Int {
    return a+b;
}

fun sumNoVMeaningfulReturn(a : Int, b : Int) : Unit {
    println("no Meaningful return function called");
}

fun defineVars() : Double {
    val a = 5;
    val b = 5.5;
    return a + b;
}

fun maxOfA(a : Int, b : Int) : Int {
    if (a > b) {
        return a;
    }
    return b;
}

fun minOfA(a : Int, b : Int) : Int {
    if (a > b)
        return a
    else
        return b;
}

fun minOfB(a : Int, b : Int) = if (a > b) a else b;

fun parseInt(arg : String) : Int? {
    try {
        return Integer.parseInt(arg);
    } catch (e : Exception) {
        return null;
    }
}

fun toInt(arg : String) : Int? {
    val parsed = parseInt(arg)
    if (parsed == null) {
        println("a cannot be parsed");
        return null;
    } else {
        return parsed;
    }
}

fun typeChecks( a : Any ) : Any {
    if (a is String) {
        return "String";
    } else {
        return a::class;
    }
}

