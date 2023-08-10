package com.example.petsaver.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petsaver.R
import com.example.petsaver.model.Materia

class AdapterExploreRV(private val context: Context, private val items: List<Materia>): RecyclerView.Adapter<AdapterExploreRV.MateriaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.item_list_home,parent,false)
        val holder = MateriaViewHolder(itemList)
        return holder
    }

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        holder.photoPerfil.setImageResource(items[position].idImagePerfil)
        holder.imageBackground.setImageResource(items[position].idImageBackGround)
        holder.titleItem.setText(items[position].title)
        holder.subTitleItem.setText(items[position].subTitle)
    }
    override fun getItemCount(): Int = items.size


    inner class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem = itemView.findViewById<TextView>(R.id.subTitle_item_card)
    }
}