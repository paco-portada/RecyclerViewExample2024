package com.example.recyclerviewexample2024

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample2024.adapter.SuperHeroAdapter
import com.example.recyclerviewexample2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var superHeroMutableList: MutableList<SuperHero> = SuperHeroProvider.superHeroList.toMutableList()
    private lateinit var adapter: SuperHeroAdapter
    private val llmanager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAddSuperHero.setOnClickListener { createSuperHero() }
        initRecyclerView()
    }

    private fun createSuperHero() {
        val superHero = SuperHero(
            "New SuperHero",
            "Aristides Corporation",
            "?",
            // "https://pbs.twimg.com/profile_images/1037281659727634432/5x2XVPwB_400x400.jpg"
            "https://dam.org.es/ficheros/homer_simpson.jpg")

        superHeroMutableList.add(3, superHero)
        adapter.notifyItemInserted(3)
        // adapter.notifyItemInserted(superHeroMutableList.size - 1)
       llmanager.scrollToPositionWithOffset(3, 20)
    }

    private fun initRecyclerView() {
        adapter = SuperHeroAdapter(
            superheroList =  superHeroMutableList,
            onClickListener =  { superHero -> onItemSelected(superHero) },
            onClickDelete = {position -> onDeletedIem(position)}
        )
        // val manager = LinearLayoutManager(this)
        // val decoration = DividerItemDecoration(this, manager.orientation)
        val decoration = DividerItemDecoration(this, llmanager.orientation)
        binding.recyclerSuperHero.layoutManager = llmanager
        // binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero -> onItemSelected(superHero) }
        binding.recyclerSuperHero.adapter = adapter
        binding.recyclerSuperHero.addItemDecoration(decoration)
    }

    private fun onDeletedIem(position: Int) {
        superHeroMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(superHero.photo))
        startActivity(intent)
    }
}