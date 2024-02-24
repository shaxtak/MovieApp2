package com.example.movieapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.movieapp.databinding.ItemRvBinding
import com.example.movieapp.models.User

class Adapter (var list: ArrayList<User>):RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding):ViewHolder(itemRvBinding.root) {

        fun onBind(user: User) {
            itemRvBinding.tvName.text = user.name
            itemRvBinding.tvAuthors.text = user.author
            itemRvBinding.tvDate.text = user.date

            itemRvBinding.btnDelete.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    deleteItem(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
    fun deleteItem(position: Int) {
    list.removeAt(position)
    notifyItemRemoved(position)
    }

}