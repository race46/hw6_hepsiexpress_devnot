package com.example.hw6

import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("loadImage")
fun ImageView.loadImage(url: String?) {
    val id = resources.getIdentifier(url, "drawable", "com.example.hw6")
    this.setImageResource(id)
}
