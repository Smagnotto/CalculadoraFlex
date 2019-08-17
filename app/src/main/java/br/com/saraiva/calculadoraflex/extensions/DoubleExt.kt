package br.com.br.com.saraiva.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)