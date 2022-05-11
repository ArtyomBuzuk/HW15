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
        const val i = 8.0 * 20.8
    }
}