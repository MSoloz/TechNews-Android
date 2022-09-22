package com.example.technews1.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.technews1.databinding.ItemNewsBinding
import com.example.technews1.model.News

class NewsAdapter: ListAdapter<News, NewsAdapter.NewsViewHolder>(object : DiffUtil.ItemCallback<News>(){

    override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
      return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem == newItem
    }
}) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class NewsViewHolder(private var binding :ItemNewsBinding ):RecyclerView.ViewHolder(binding.root) {

        fun bind(news:News){

            binding.apply {


                newsUserName.text = news.creator.name
                Glide.with(newsUserImage).load("http://192.168.157.1:3000/img/" + news.creator.image)
                    .into(newsUserImage)
                newsDescription.text = news.text
                Glide.with(newsImage).load("http://192.168.157.1:3000/img/" + news.image)
                    .into(newsImage)


            }
        }
    }


}