package com.w11k.examples.kotlin

import com.w11k.examples.kotlin.calc.negate
import com.w11k.examples.kotlin.calc.operators.Variable
import com.w11k.examples.kotlin.calc.plus
import com.w11k.examples.kotlin.calc.toConstant
import com.w11k.examples.kotlin.library.*

fun main(args: Array<String>) {
    println("Hello Kotlin")
    val two = 2.toConstant()
    val a = Variable("a", 5)
    println("""the int 2 will be converted to $two and be evaluated to ${two.eval()} and be negated ${two.negate()}""")
    println("""a is a variable "$a" and has the value ${a.eval()}""")
    println("""use extension for plus ${two + two} evals to ${(two + two).eval()}""")

    println()
    println("---------------------------------------------------------")
    println()

    val sapkowski = Person("Andrej Sapkoswski", "male")
    val letzterWunsch = Book("s1Foo", "Der letzte Wunsch", "1987", sapkowski)
    val narrenturm = letzterWunsch.copy(inventoryId = "s2Foo", title = "Narrenturm", isHardcover = false)
    val bio = Article("s3Foo", "Biographie Sapkowski", Person("Hanelore Wolf", "female"))

    val items: List<Item> = listOf(letzterWunsch, narrenturm, bio, object : Item("foo") {})

    val lib = Library(items)

    println(lib.catalog)
    println(lib.catalog.map { item -> item.inventoryId })

    println(lib.catalog.filter { if (it is Book) it.isHardcover else false })

    println(lib.catalog.map {
        when (it) {
            is Book -> """{Book: ${it.title}}"""
            is Article -> """{Article: ${it.title}}"""
            else -> "{unknown Item type}"
        }
    })

}
