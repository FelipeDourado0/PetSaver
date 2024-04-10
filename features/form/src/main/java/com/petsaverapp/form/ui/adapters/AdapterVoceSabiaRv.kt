package com.petsaverapp.form.ui.adapters

import android.content.Context
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain
import com.petsaverapp.form.R
import com.petsaverapp.form.ui.dataEntities.Materia


class AdapterVoceSabiaRv(private val context: Context, private val items: List<MateriaDomain>) :
    RecyclerView.Adapter<AdapterVoceSabiaRv.MateriaViewHolder>() {

    var onItemCLick: ((Materia) -> Unit)? = null

    inner class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem: TextView = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem: TextView = itemView.findViewById<TextView>(R.id.subTitle_item_card)
        val cardView: CardView = itemView.findViewById<CardView>(R.id.cardViewHome)
        val detalheFundo: ImageView = itemView.findViewById<ImageView>(R.id.detalheFundo)

        fun bind(materiaData: MateriaDomain, position: Int){
            Glide.with(context).load(materiaData.imagePerfilUrl).into(photoPerfil)
            Glide.with(context).load(materiaData.imageBackGroundUrl).into(imageBackground)
            titleItem.text = materiaData.title
            subTitleItem.text = materiaData.subTitle
            photoPerfil.setOnClickListener {
                Toast.makeText(context,"Foto não expande!", Toast.LENGTH_SHORT).show()
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                detalheFundo.setRenderEffect(
                    RenderEffect.createBlurEffect(
                        10F, 50F, Shader.TileMode.MIRROR
                    )
                )
            }

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
            LayoutInflater.from(context).inflate(R.layout.item_list_vocesabia_home, parent, false)
        return MateriaViewHolder(itemList)
    }



    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        holder.bind(items[position],position)
    }
}