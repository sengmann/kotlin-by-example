package com.w11k.examples.kotlin.library

abstract class Item(open val inventoryId: String) {
}

data class Book(
    override val inventoryId: String,
    val title: String,
    val year: String,
    val author: Person,
    val isHardcover: Boolean = true
) : Item(inventoryId)

data class Article(
    override val inventoryId: String,
    val title: String,
    val author: Person,
    val abstract: String? = null
): Item(inventoryId)

data class Person(val name: String, val gender: String)