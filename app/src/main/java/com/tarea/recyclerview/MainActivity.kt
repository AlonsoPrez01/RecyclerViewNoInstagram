package com.tarea.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val publicaciones = ArrayList<Publicacion>()
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))
        publicaciones.add(Publicacion("@alonsoprzfls", "@alonsoprzfls", "100 likes", "Texto descriptivo de la publicación", "20 comentarios"))

        val adapter = Adapter(publicaciones)
        recyclerView.adapter = adapter


    }
}