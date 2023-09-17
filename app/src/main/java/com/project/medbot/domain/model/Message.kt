package com.project.medbot.domain.model

data class Message(
    val type: String,
    val sender: String,
    val messageContent: String
)
