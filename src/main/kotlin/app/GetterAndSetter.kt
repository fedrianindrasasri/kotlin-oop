package app

import data.BigNote
import data.Note

fun main(){
    val note = Note("My Diary Kotlin")
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}