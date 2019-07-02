// TODO: From https://kotlinlang.org/docs/reference/idioms.html


// Creatign DTOs ->
//   -> provides new class with getters, setters, equals, hashcode, copy, component1...component2 ... for all properties

data class Customer(var name: String, var email: String);


// Default values for functions:

fun myFun(a : Int = 5) {
    println("myFun called with value: " + a);
}

fun main() {
    myFun(5);
}

// TODO: Instance interpolation

// TODO: Instance checks (with when: ... from : https://kotlinlang.org/docs/reference/idioms.html)

// TODO: Traersing a map/list of class (in, step, downTo. .. )

// TODO: Read-only list

// TODO: Accessing a map

// TODO: Lazy property

// TODO: Extension functions

// TODO: Creating a singleton

// TODO: If not null shorthand + if-not-null-and-else shorthand

// TODO: Exec a statement when null:   xxxx ?: throw IllegalStateException("... was null...");

// TODO: Map nullable if not null

// TODO: Get first item of possilby empty collection

// TODO: Execute if not null:  value?.let { <<block>> }

// TODO: Map nullable value if not null

// TODO: Return on when statement

// TODO: Try...catch...

// TODO:  'IF' expression with val...

// TODO: Builder-style .... (? dont get it ). IntArray(size).apply ( fill ( -1 ) };

// TODO: Single-expression functions fun x() = 42;
   // fun transform(color : String) : Int = when (color) { "Red" -> 0, "Green" -> 1, "BLUe" -> 2 };

// TODO: Calling multiple methods on object instance (with (obj) { objFun1(..); objFUn2(...); for (x ...) { ... objFun3(); } ... }

// TODO: Java 7 try-with-resources  ( stream.buffered().reader().use { reader -> println(reader.readText()) } }.

// TODO: Convienent form for a generic function that requires the generic type info:
  // inline fun <reified T: any> Gson.fromJson(json : JsonElement) : T = this.fromJson(json, T::class.java)

// TODO: Consuming a nullable boolean val b: Boolean? = ... ; if (b==true) {} else { // false or null }

// TODO: Swapping two variables: var a = 1; var b = 2; a = b.also { b = a }

