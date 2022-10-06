fun stringTemplates() { // szablon napisow
    var a = 1

    val s1 = "a is $a" // string wypisujaca zawartosc zmiennej (Int) 'a'

    a = 2

    /*
    *  '${s1.replace(oldValue,newValue)}
    *   ten kod pokazuje nam sposob zamiany konkretnych slow w stringu na nowa wartosc
    *   oraz dodanie nowa czesc stringa
    */
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}