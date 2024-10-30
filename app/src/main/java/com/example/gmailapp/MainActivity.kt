package com.example.gmailapp

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportActionBar?.title = "Inbox"

        val recyclerView = findViewById<RecyclerView>(R.id.emailRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(generateSampleEmails())
    }

    private fun generateSampleEmails(): List<Email> {
        return listOf(
            Email(
                senderInitial = "E",
                sender = "Edurila.com",
                subject = "$19 Only (First 10 spots) - Bestselling...",
                preview = "Are you looking to Learn Web Designin...",
                time = "12:34 PM",
                color = Color.rgb(66, 133, 244)
            ),
            Email(
                senderInitial = "C",
                sender = "Chris Abad",
                subject = "Help make Campaign Monitor better",
                preview = "Let us know your thoughts! No Images...",
                time = "11:22 AM",
                color = Color.rgb(244, 122, 93)
            ),
            Email(
                senderInitial = "T",
                sender = "Tuto.com",
                subject = "8h de formation gratuite et les nouvea...",
                preview = "Photoshop, SEO, Blender, CSS, WordPre...",
                time = "11:04 AM",
                color = Color.rgb(124, 179, 66)
            ),
            Email(
                senderInitial = "S",
                sender = "support",
                subject = "Société Ovh : suivi de vos services",
                preview = "SAS OVH - http://www.ovh.com 2 rue K...",
                time = "10:26 AM",
                color = Color.rgb(158, 158, 158)
            ),
            Email(
                senderInitial = "E",
                sender = "Edurila.com",
                subject = "$19 Only (First 10 spots) - Bestselling...",
                preview = "Are you looking to Learn Web Designin...",
                time = "12:34 PM",
                color = Color.rgb(66, 133, 244)
            ),
            Email(
                senderInitial = "C",
                sender = "Chris Abad",
                subject = "Help make Campaign Monitor better",
                preview = "Let us know your thoughts! No Images...",
                time = "11:22 AM",
                color = Color.rgb(244, 122, 93)
            ),
            Email(
                senderInitial = "T",
                sender = "Tuto.com",
                subject = "8h de formation gratuite et les nouvea...",
                preview = "Photoshop, SEO, Blender, CSS, WordPre...",
                time = "11:04 AM",
                color = Color.rgb(124, 179, 66)
            ),
            Email(
                senderInitial = "S",
                sender = "support",
                subject = "Société Ovh : suivi de vos services",
                preview = "SAS OVH - http://www.ovh.com 2 rue K...",
                time = "10:26 AM",
                color = Color.rgb(158, 158, 158)
            ),
            Email(
                senderInitial = "E",
                sender = "Edurila.com",
                subject = "$19 Only (First 10 spots) - Bestselling...",
                preview = "Are you looking to Learn Web Designin...",
                time = "12:34 PM",
                color = Color.rgb(66, 133, 244)
            ),
            Email(
                senderInitial = "C",
                sender = "Chris Abad",
                subject = "Help make Campaign Monitor better",
                preview = "Let us know your thoughts! No Images...",
                time = "11:22 AM",
                color = Color.rgb(244, 122, 93)
            ),
            Email(
                senderInitial = "T",
                sender = "Tuto.com",
                subject = "8h de formation gratuite et les nouvea...",
                preview = "Photoshop, SEO, Blender, CSS, WordPre...",
                time = "11:04 AM",
                color = Color.rgb(124, 179, 66)
            ),
            Email(
                senderInitial = "S",
                sender = "support",
                subject = "Société Ovh : suivi de vos services",
                preview = "SAS OVH - http://www.ovh.com 2 rue K...",
                time = "10:26 AM",
                color = Color.rgb(158, 158, 158)
            ),
        )
    }
}