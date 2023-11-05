package com.petsaverapp.form.ui.Adapters

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
import com.petsaverapp.core.data.database.model.MateriaDomain
import com.petsaverapp.form.R
import com.petsaverapp.form.ui.dataEntities.Materia

class AdapterExploreRv(private val context: Context, private val items: List<MateriaDomain>) :
    RecyclerView.Adapter<AdapterExploreRv.MateriaViewHolder>() {
    var onItemCLick: ((Materia) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val itemList =
            LayoutInflater.from(context).inflate(R.layout.item_list_explore_home, parent, false)
        return MateriaViewHolder(itemList)
    }

    inner class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem: TextView = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem: TextView = itemView.findViewById<TextView>(R.id.subTitle_item_card)
        val cardCompleto: ViewGroup = itemView.findViewById<ViewGroup>(R.id.mainConstraintHome)
        val detalheFundo: ImageView = itemView.findViewById<ImageView>(R.id.detalheFundo)
    }

    override fun getItemCount(): Int = items.size
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        Glide.with(context).load(items[position].imagePerfilUrl).into(holder.photoPerfil)
        Glide.with(context).load(items[position].imageBackGroundUrl).into(holder.imageBackground)
        holder.titleItem.text = items[position].title
        holder.subTitleItem.text = items[position].subTitle

        holder.detalheFundo.setRenderEffect(RenderEffect.createBlurEffect(100F,100f,Shader.TileMode.MIRROR))
        if(position == items.size - 1){
            val param = holder.cardCompleto.layoutParams as ViewGroup.MarginLayoutParams
            param.setMargins(60,0,60,0)
            holder.cardCompleto.layoutParams = param
        }

        holder.itemView.setOnClickListener {
            onItemCLick?.invoke(
                Materia(
                    exploreList = items[position].exploreList,
                    voceSabiaList = items[position].voceSabiaList,
                    mainText = items[position].mainText,
                    subTitle = items[position].subTitle,
                    title = items[position].title,
                    tema = items[position].tema,
                    date = items[position].dataMateria.toString(),
                    imageBackGroundUrl = items[position].imageBackGroundUrl,
                    imagePerfilUrl = items[position].imagePerfilUrl,
                    nameWriter = items[position].nameWriter
                )
            )
        }
    }
}