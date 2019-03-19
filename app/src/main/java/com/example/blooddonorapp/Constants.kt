package com.example.blooddonorapp

object Constants {

    enum class AccountType {
        DONOR, RECIPIENT;
    }

    var bloodGroupList: Array<String> = arrayOf("O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-")

}