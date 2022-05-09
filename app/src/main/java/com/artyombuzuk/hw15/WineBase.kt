package com.artyombuzuk.hw15

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.util.*

class WineBase(
    var name: String,
    var tradeMark: String,
    var country: String,
    var dateSpill: String,
    var note: String
) {
    fun Viderzhka(curDate: String): Period? {
     //   val format = SimpleDateFormat("dd/MM/yyyy")
      //  var date1: Date = format.parse(curDate)
        val date1 = LocalDate.now()
//        var date1 = LocalDate.parse(curDate.toString())
        var date2 = LocalDate.parse(dateSpill)
        var period = Period.between(date1, date2)
        return period
    }
}