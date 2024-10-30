package com.example.gmailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val initialTextView: TextView = itemView.findViewById(R.id.initialTextView)
        val senderTextView: TextView = itemView.findViewById(R.id.senderTextView)
        val subjectTextView: TextView = itemView.findViewById(R.id.subjectTextView)
        val previewTextView: TextView = itemView.findViewById(R.id.previewTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        val initialBackground: CardView = itemView.findViewById(R.id.initialBackground)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.initialTextView.text = email.senderInitial
        holder.senderTextView.text = email.sender
        holder.subjectTextView.text = email.subject
        holder.previewTextView.text = email.preview
        holder.timeTextView.text = email.time
        holder.initialBackground.setCardBackgroundColor(email.color)
    }

    override fun getItemCount() = emails.size
}