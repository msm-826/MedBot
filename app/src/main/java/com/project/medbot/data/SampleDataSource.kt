package com.project.medbot.data

import com.project.medbot.domain.model.Message

object SampleDataSource {
    val sampleData = listOf(
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Hi, I've been having some health issues lately that I'm concerned about."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "Hello, I'm here to help. What symptoms have you been experiencing?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "I've had a really bad cough that won't go away, and I've been feeling" +
                    " tired all the time. I also have had a fever on and off for the past few days."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "I'm sorry to hear you haven't been feeling well. A persistent cough," +
                    " fatigue, and fever can indicate a few different illnesses. Do you have any " +
                    "other symptoms, like a sore throat, body aches, or nasal congestion?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Yes, I have had a sore throat and some body aches too. No nasal " +
                    "congestion though."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "Okay, with the combination of cough, fever, body aches, and sore " +
                    "throat, it sounds like you may have the flu. The flu virus is going around " +
                    "right now. My recommendation would be to get plenty of rest, drink lots of " +
                    "fluids, and take over-the-counter medication like acetaminophen or ibuprofen " +
                    "to help relieve the fever and body aches. You should start feeling better in " +
                    "about a week. If symptoms get worse or persist for more than 10 days, you " +
                    "should see your doctor. Does this sound like what you're experiencing?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Yes, that sounds exactly like what I'm going through. Thank you for" +
                    " the advice! I'll be sure to rest up and take care of myself. If it lasts too" +
                    " long I'll make an appointment with my doctor"
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "You're welcome! I'm glad I could provide some guidance. Feel better" +
                    " soon, and don't hesitate to check back in if you have any other health concerns arise"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Hi, I've been having some health issues lately that I'm concerned about."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "Hello, I'm here to help. What symptoms have you been experiencing?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "I've had a really bad cough that won't go away, and I've been feeling" +
                    " tired all the time. I also have had a fever on and off for the past few days."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "I'm sorry to hear you haven't been feeling well. A persistent cough," +
                    " fatigue, and fever can indicate a few different illnesses. Do you have any " +
                    "other symptoms, like a sore throat, body aches, or nasal congestion?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Yes, I have had a sore throat and some body aches too. No nasal " +
                    "congestion though."
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "Okay, with the combination of cough, fever, body aches, and sore " +
                    "throat, it sounds like you may have the flu. The flu virus is going around " +
                    "right now. My recommendation would be to get plenty of rest, drink lots of " +
                    "fluids, and take over-the-counter medication like acetaminophen or ibuprofen " +
                    "to help relieve the fever and body aches. You should start feeling better in " +
                    "about a week. If symptoms get worse or persist for more than 10 days, you " +
                    "should see your doctor. Does this sound like what you're experiencing?"
        ),
        Message(
            type = "Query",
            sender = "USER",
            messageContent = "Yes, that sounds exactly like what I'm going through. Thank you for" +
                    " the advice! I'll be sure to rest up and take care of myself. If it lasts too" +
                    " long I'll make an appointment with my doctor"
        ),
        Message(
            type = "Reply",
            sender = "BOT",
            messageContent = "You're welcome! I'm glad I could provide some guidance. Feel better" +
                    " soon, and don't hesitate to check back in if you have any other health concerns arise"
        )
    )
}