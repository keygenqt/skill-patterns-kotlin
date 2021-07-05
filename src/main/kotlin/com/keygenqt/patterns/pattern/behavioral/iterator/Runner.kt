package com.keygenqt.patterns.pattern.behavioral.iterator

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {

        println("----> array")
        val array = Iterator(arrayOf(1, 2, 3, 4, 5))
        while (array.hasNext()) {
            println(array.getNext())
        }

        println("----> arrayList")
        val arrayListUsers = Iterator(arrayListOf(User(), User(), User(), User()))
        while (arrayListUsers.hasNext()) {
            println(arrayListUsers.getNext().name)
        }

        println("----> listProducts")
        val listProducts = Iterator(listOf(Product(), Product(), Product(), Product()))
        while (listProducts.hasNext()) {
            println(listProducts.getNext().name)
        }

        println("----> mutableListAny")
        val mutableListAny = Iterator(mutableListOf(User(), User(), Product(), Product()))
        while (mutableListAny.hasNext()) {
            when (val item = mutableListAny.getNext()) {
                is User -> println(item.name)
                is Product -> println(item.name)
            }
        }
    }
}