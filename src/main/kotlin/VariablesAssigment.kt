fun variableAssigment() { // przypisywanie wartosci
    val a: Int = 1  // przypisanie z gory
    val b = 2   // Rodzaj `Int` jest wywnioskowany
    val c: Int  // Rodzaj wymagany kiedy nie ma narzuconej wartosci
    c = 3       // deferred assignment / przypisanie odroczne
    println("a = $a, b = $b, c = $c") // "$" wypisuje w stringu zmienne
}