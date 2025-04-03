package com.example.ipv4checker

fun main(){
    test(
        name="Test 1 - when IPv4 address is valid should return true",
        result=ipv4Checker("192.168.1.1"),
        correctResult= true
    )

    test(
        name="Test 2 - when IPv4 invalid (contain letter) should return false",
        result=ipv4Checker("192.168.a.1"),
        correctResult= false
    )

    test(
        name="Test 3 - when IPv4 invalid (contain more than 4 segment ) should return false",
        result=ipv4Checker("192.168.1.1.5"),
        correctResult= false
    )

    test(
        name="Test 4 - when IPv4 invalid (contain less than 4 segment ) should return false",
        result=ipv4Checker("192.168.1"),
        correctResult= false
    )

    test(
        name="Test 5 - when IPv4 invalid (numbers out of range value ) should return false",
        result=ipv4Checker("300.168.1.1"),
        correctResult= false
    )

    test(
        name="Test 6 - when IPv4 invalid (leading 0 ) should return false",
        result=ipv4Checker("192.168.01.1"),
        correctResult= false
    )

    test(
        name="Test 7 - when IPv4 is empty string should return false",
        result=ipv4Checker(""),
        correctResult= false
    )

    test(
        name="Test 8 - when IPv4 contain special character should return false",
        result=ipv4Checker("192.168.1.@"),
        correctResult= false
    )

    test(
        name="Test 9 - when IPv4 valid with min valid number 0.0.0.0 should return true",
        result=ipv4Checker("0.0.0.0"),
        correctResult= true
    )

    test(
        name="Test 10 - when IPv4 valid with max valid number 255.255.255.255 should return true",
        result=ipv4Checker("255.255.255.255"),
        correctResult= true
    )

    test(
        name="Test 11 - when IPv4 contains comma instead of dots should return false",
        result=ipv4Checker("255,255,255,255"),
        correctResult= false
    )

    test(
        name="Test 12 - when IPv4 contains negative number should return false",
        result=ipv4Checker("255.-255.255.255"),
        correctResult= false
    )

    test(
        name="Test 13 - when IPv4 contains consecutive dots should return false",
        result=ipv4Checker("255..255.255.255"),
        correctResult= false
    )

}
fun test(name: String, result:Boolean, correctResult:Boolean){
    if (result == correctResult){
        println("Passed - $name - $result")
    } else{
        println("Failed - $name - $result")
    }
}