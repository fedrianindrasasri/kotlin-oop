package app

import data.Address
import data.Person

fun main() {
//    ini adalah object
    val fedrian = Person(
        "Fedrian",
        "Indra",
        "Sasri"
    )

//    ini adalh object
    val alamat = Address("Jalan Serobong No.36","Balikpapan")

    println("Nama\t: ${fedrian.firstName} ${fedrian.middleName} ${fedrian.lastName}")
    println("Alamat\t: ${alamat.street} Kota ${alamat.city} ${alamat.country}")
}