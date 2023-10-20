package data

class Car(paramBrand: String, paramYear: Int, paramName: String) {
    //    Initializer BLock
    init {
        println("Car $paramBrand dibuat")
    }

    //    Seondary Constractor
    constructor(paramBrand: String, paramName: String) : this(paramBrand, 2020, paramName) {
        println("Seondary Constractor")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
    var name: String = paramName
}