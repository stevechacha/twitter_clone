package com.steve.twitterclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.steve.twitterclone.R
import com.steve.twitterclone.databinding.PostListItemBinding

class RvAdapter : RecyclerView.Adapter<RvAdapter.TweetViewHolder>() {

    inner class TweetViewHolder(val tweet:PostListItemBinding):RecyclerView.ViewHolder(tweet.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {

        return TweetViewHolder(PostListItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,false))

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20

    }
}