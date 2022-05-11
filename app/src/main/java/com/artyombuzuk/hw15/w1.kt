package com.artyombuzuk.hw15

import java.text.SimpleDateFormat
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
        var date1: Date? = null
        var date2: Date? = null
            date1 = format.parse(curDate)
            date2 = format.parse(dateSpill)
        val difference: Long = date1.getTime() - date2.getTime()
        return difference / (24 * 60 * 60 * 1000)
    }
}