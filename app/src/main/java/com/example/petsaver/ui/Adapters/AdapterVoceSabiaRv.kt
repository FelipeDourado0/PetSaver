package com.example.petsaver.ui.Adapters

import android.content.Context
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.petsaver.R
import com.example.petsaver.database_materia.model.Materia
import com.example.petsaver.ui.fragments.MateriaFragment
import kotlinx.coroutines.Job

class AdapterVoceSabiaRv(private val context: Context, private val items: List<Materia>) :
    RecyclerView.Adapter<AdapterVoceSabiaRv.MateriaViewHolder>() {

    var onItemClick : ((Materia) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val itemList =
            LayoutInflater.from(context).inflate(R.layout.item_list_vocesabia_home, parent, false)
        return MateriaViewHolder(itemList)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        Glide.with(context).load(items[position].imagePerfilUrl).into(holder.photoPerfil)
        Glide.with(context).load(items[position].imageBackGroundUrl).into(holder.imageBackground)
        holder.titleItem.setText(items[position].title)
        holder.subTitleItem.setText(items[position].subTitle)
        /*holder.itemView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                Log.e("Click", "clickou")
                *//*val activity= v!!.context as AppCompatActivity
                val materiaFragment = MateriaFragment()
                activity.supportFragmentManager.beginTransaction().replace(R.id.action_home_to_materiaFragment,materiaFragment).addToBackStack(null).commit()*//*
            }
        })*/

        holder.itemView.setOnClickListener {
            it.setOnClickListener {
                onItemClick?.invoke(items[position])
                /*Log.e("Click", "clickou")
                val activity = it!!.context as
                val materiaFragment = MateriaFragment()
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.action_home_to_materiaFragment, materiaFragment)
                    .addToBackStack(null).commit()*/
                //findNavController(materiaFragment).navigate(R.id.action_home_to_materiaFragment)
            }
            Log.i("Click", "clickou")
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            holder.detalheFundo.setRenderEffect(
                RenderEffect.createBlurEffect(
                    10F,
                    50F,
                    Shader.TileMode.MIRROR
                )
            )
        }
    }

    inner class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoPerfil = itemView.findViewById<ImageView>(R.id.photoPerfil)!!
        val imageBackground = itemView.findViewById<ImageView>(R.id.imageBackGround)!!
        val titleItem = itemView.findViewById<TextView>(R.id.title_item_card)
        val subTitleItem = itemView.findViewById<TextView>(R.id.subTitle_item_card)
        val cardView = itemView.findViewById<CardView>(R.id.cardViewHome)
        val detalheFundo = itemView.findViewById<ImageView>(R.id.detalheFundo)
    }
}