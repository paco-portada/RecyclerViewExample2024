package com.example.recyclerviewexample2024.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample2024.SuperHero
import com.example.recyclerviewexample2024.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)

    fun render(
        superHeroModel: SuperHero,
        onClickListener: (SuperHero) -> Unit,
        onClickDelete: (Int) -> Unit
    ) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        // Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        Picasso.get().load(superHeroModel.photo).into(binding.ivSuperHero);
        itemView.setOnClickListener {
            onClickListener(superHeroModel)
        }
        binding.btnDelete.setOnClickListener { onClickDelete(adapterPosition) }
    }
}