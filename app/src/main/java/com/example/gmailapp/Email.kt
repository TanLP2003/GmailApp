package com.example.gmailapp

data class Email(
    val senderInitial: String,
    val sender: String,
    val subject: String,
    val preview: String,
    val time: String,
    val color: Int
)
