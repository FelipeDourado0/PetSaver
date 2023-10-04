package com.example.petsaver.ui.Adapters

import android.content.Context
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.petsaver.R
import com.example.petsaver.database_materia.model.MateriaDomain

class AdapterExploreRv(private val context: Context, private val items: List<MateriaDomain>) :
    RecyclerView.Adapter<AdapterExploreRv.MateriaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val itemList =
            LayoutInflater.from(context).inflate(R.layout.item_list_explore_home, parent, false)
        return MateriaViewHolder(itemList)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        Glide.with(context).load(items[position].imagePerfilUrl).into(holder.photoPerfil)
        Glide.with(context).load(items[position].imageBackGroundUrl).into(holder.imageBackground)
        holder.titleItem.setText(items[position].title)
        holder.subTitleItem.setText(items[position].subTitle)

        holder.detalheFundo.setRenderEffect(RenderEffect.createBlurEffect(100F,100f,Shader.TileMode.MIRROR))
        if(position == items.size - 1){
            val param = holder.cardCompleto.layoutParams as ViewGroup.MarginLayoutParams
            param.setMargins(60,0,60,0)
            holder.cardCompleto.layoutParams = param
        }

    }

    override fun getItemCount(): Int = items.size

    inner class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem = itemView.findViewById<TextView>(R.id.subTitle_item_card)
        val cardCompleto = itemView.findViewById<ViewGroup>(R.id.mainConstraintHome)
        val detalheFundo = itemView.findViewById<ImageView>(R.id.detalheFundo)
    }
}