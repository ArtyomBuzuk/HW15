package com.artyombuzuk.hw15

import java.text.SimpleDateFormat
import java.time.Period
import java.util.*

class Wine1(
    var note: String,
    var dateSpill: String,
    var country: String,
    var tradeMark: String,
    var name: String
) {
    fun Viderzhka(curDate: String?): Long {
        val format = SimpleDateFormat("dd/MM/yyyy")
        var date1: Date? = format.parse(curDate)
        var date2: Date? = format.parse(dateSpill)
//            date1 = format.parse(curDate)
//            date2 = format.parse(dateSpill)
//        val difference: Long = date1.getTime() - date2.getTime()

        val difference: Period? = Period.between(date1, date2)
        val a=24
        val b=60
        val c=60
        val d=1000
        return difference / (a * b * c * d)
    }
}