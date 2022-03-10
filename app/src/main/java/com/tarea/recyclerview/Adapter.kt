package com.tarea.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val publicacionList: ArrayList<Publicacion>) : RecyclerView.Adapter<Adapter.ViewHolder>(){

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItems(publicacion: Publicacion){
            val user1 = itemView.findViewById(R.id.usuario1) as TextView
            val user2 = itemView.findViewById(R.id.usuario2) as TextView
            val likes = itemView.findViewById(R.id.likes) as TextView
            val texto = itemView.findViewById(R.id.texto) as TextView
            val coments = itemView.findViewById(R.id.coments) as TextView

            user1.text = publicacion.usuario1.toString()
            user2.text = publicacion.usuario2.toString()
            likes.text = publicacion.likes.toString()
            texto.text = publicacion.comentarios.toString()
            coments.text = publicacion.texto.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publicacion, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(publicacionList[position])
    }

    override fun getItemCount(): Int {
        return publicacionList.size
    }
}