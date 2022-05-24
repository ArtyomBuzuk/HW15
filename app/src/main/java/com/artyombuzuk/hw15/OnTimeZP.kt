package com.artyombuzuk.hw15

import java.text.NumberFormat
import java.util.*


class OnTimeZP(id: Int, firstName: String?, secondName: String?, var hourPayment: Double) {
    val averagePayment: Double
        get() = hourPayment * i

    override fun toString(): String {
        val format: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)
        return super.toString() + " зп с почасовой оплатой " + format.format(averagePayment)
    }

    companion object {
        val a = 8.0
        val b = 20.8
        val i = a * b
    }
}