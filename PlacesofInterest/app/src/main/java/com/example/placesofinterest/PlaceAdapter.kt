package com.example.placesofinterest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(private val places: ArrayList<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    class ViewHolder(val placeViewText: View) : RecyclerView.ViewHolder(placeViewText) {
        fun bind(place: Place) {
            itemView.tvPlace.text = place.name
            itemView.ivPlace.setImageResource(place.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val placeView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_place, parent, false)
        return ViewHolder(placeView)
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }
}
