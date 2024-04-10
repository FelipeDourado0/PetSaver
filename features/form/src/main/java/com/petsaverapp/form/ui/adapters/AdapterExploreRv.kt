package com.petsaverapp.form.ui.adapters

import android.content.Context
import android.graphics.RenderEffect.*
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain
import com.petsaverapp.form.R
import com.petsaverapp.form.ui.dataEntities.Materia

class AdapterExploreRv(private val context: Context, private val items: List<MateriaDomain>) :
    RecyclerView.Adapter<AdapterExploreRv.MateriaViewHolder>() {
    var onItemCLick: ((Materia) -> Unit)? = null

    inner class MateriaViewHolder(itemView: View) : ViewHolder(itemView) {
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem: TextView = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem: TextView = itemView.findViewById<TextView>(R.id.subTitle_item_card)
        val cardCompleto: ViewGroup = itemView.findViewById<ViewGroup>(R.id.mainConstraintHome)
        val detalheFundo: ImageView = itemView.findViewById<ImageView>(R.id.detalheFundo)

        //função para atribuir os valores da viewItem no onBindViewHolder
        fun bind(materiaData: MateriaDomain, position: Int){
            Glide.with(context).load(materiaData.imagePerfilUrl).into(photoPerfil)
            Glide.with(context).load(materiaData.imageBackGroundUrl).into(imageBackground)
            titleItem.text = materiaData.title
            subTitleItem.text = materiaData.subTitle

            //holder.detalheFundo.setRenderEffect(createBlurEffect(100F,100f,Shader.TileMode.MIRROR))
            if(position == items.size - 1){
                val param = cardCompleto.layoutParams as ViewGroup.MarginLayoutParams
                param.setMargins(60,0,60,0)
                cardCompleto.layoutParams = param
            }

            //colocando setOnClickListenet no itemView
            itemView.setOnClickListener {
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
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val itemList =
            LayoutInflater.from(context).inflate(R.layout.item_list_explore_home, parent, false)
        return MateriaViewHolder(itemList)
    }



    override fun getItemCount(): Int = items.size
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        holder.bind(items[position],position)
    }
}