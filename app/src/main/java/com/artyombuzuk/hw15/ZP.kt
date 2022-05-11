package com.artyombuzuk.hw15

import java.util.*
import kotlin.Comparator


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val id = 0
        val workers= TreeSet(
            Comparator<Any?> { a, b ->
                val diff: Double = a.getAveragePayment() - b.getAveragePayment()
                if (diff > 0.0) -1 else if (diff < 0.0) 1 else {
                    a.getFirstName().compareTo(b.getFirstName())
                }
            })
        workers.add(FixZP(1, "Sergei", "Ivanov", 10000))
        workers.add(FixZP(2, "Ihar", "Petrov", 20000))
        workers.add(FixZP(3, "Dima", "Sergeev", 30000))
        workers.add(OnTimeZP(4, "Ivan", "Ivanov", 100))
        workers.add(OnTimeZP(5, "Peter", "Petrov", 150))
        for (w in workers) println(w)
    }
}