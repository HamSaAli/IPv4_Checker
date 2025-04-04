package com.example.ipv4checker


fun ipv4Checker(ip: String): Boolean {
    val parts = ip.split(".")

    if (parts.size != 4) return false

    for (part in parts) {
        if (part.isEmpty() || part.any { !it.isDigit() }) return false

        val number = part.toIntOrNull() ?: return false

        if (number !in 0..255) return false

        if (part != number.toString()) return false
    }

    return true
}