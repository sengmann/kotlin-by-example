package com.w11k.examples.kotlin

import com.w11k.examples.kotlin.calc.operators.Constant
import com.w11k.examples.kotlin.calc.operators.Multiplication
import com.w11k.examples.kotlin.calc.operators.Plus
import com.w11k.examples.kotlin.calc.operators.Variable
import com.w11k.examples.kotlin.calc.plus
import com.w11k.examples.kotlin.calc.toConstant
import com.w11k.examples.kotlin.calc.types.VariableAssigment
import com.w11k.examples.kotlin.library.*

fun main(args: Array<String>) {
    println("Hello Kotlin")
    val va = VariableAssigment()
    va.assign("a", 5)
    val two = 2.toConstant()
    val a = Variable("a")
    val complicatedExpression = Multiplication(Plus(Constant(3), Multiplication(a, 3.toConstant())), 2.toConstant())
    println("""the int 2 will be converted to $two and be evaluated to ${two.eval(va)}""")
    println("""a is a variable "$a" and has the value ${a.eval(va)}""")
    println("""use extension for plus ${two + two} evals to ${(two + two).eval(va)}""")
    println("""complicatedExpression $complicatedExpression evals to ${complicatedExpression.eval(va)}""")

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
