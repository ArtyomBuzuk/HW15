package com.artyombuzuk.hw15

import java.text.NumberFormat
import java.util.*


class FixZP(id: Int, firstName: String?, secondName: String?, var averagePayment: Int) {

    override fun toString(): String {
        val format: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)
        return super.toString() + " фиксированное зп " + format.format(averagePayment)
    }
}