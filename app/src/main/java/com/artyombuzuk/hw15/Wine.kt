package com.artyombuzuk.hw15

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class Wine {
    object Main {
        @JvmStatic
        fun main(args: Array<String>) {
            val wine1 = Wine1(
                "Это вино уже испортилось, но всё равно оно очень дорогое ($160 000 за бутылку) " +
                        "и престижное. Все дело в инициалах «Th.J.», принадлежащих Томасу Джефферсону. " +
                        "Борец за независимость США приобрел Chateau Lafite во время путешествия во Францию," +
                        " там же на этикетки нанесли его инициалы.",
                "01/08/1787",
                "USA",
                "THJ", "Chateau Lafite "
            )
            val df: DateFormat = SimpleDateFormat("dd/MM/yyyy")
            df.setTimeZone(TimeZone.getTimeZone("EAT"))
            val d1: String = df.format(Date())
            println(
                "Выдержка вина под названием " + wine1.name +
                        " составляет " + wine1.Viderzhka(d1).toString() + " дней"
            )
            println("Его торговая марка: " + wine1.tradeMark)
            println("Страна производства: " + wine1.country)
            println("Примечание: " + wine1.note)
        }
    }
}