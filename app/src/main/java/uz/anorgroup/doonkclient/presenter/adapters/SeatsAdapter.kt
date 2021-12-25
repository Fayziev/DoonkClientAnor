package uz.anorgroup.doonkclient.presenter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.data.others.SeatData
import uz.anorgroup.doonkclient.databinding.ItemSeatBinding

class SeatsAdapter : ListAdapter<SeatData, SeatsAdapter.HistoryVH>(MyDifUtils) {
    private var itemListener: ((SeatData) -> Unit)? = null

    object MyDifUtils : DiffUtil.ItemCallback<SeatData>() {
        override fun areItemsTheSame(oldItem: SeatData, newItem: SeatData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: SeatData, newItem: SeatData): Boolean {
            return oldItem == newItem
        }
    }

    inner class HistoryVH(view: View) : RecyclerView.ViewHolder(view) {
        private val bind by viewBinding(ItemSeatBinding::bind)

        init {
            bind.item.setOnClickListener {
                getItem(absoluteAdapterPosition)?.let { it1 -> itemListener?.invoke(it1) }

            }
        }

        fun load() {
            val value = getItem(absoluteAdapterPosition)
            if (value.state == 0) {
                bind.stateImage.visibility = View.INVISIBLE
            } else if (value.state == 1) {
                bind.stateImage.setImageResource(R.drawable.white_armchair)
            } else if (value.state == 2) {
                bind.stateImage.setImageResource(R.drawable.red_armchair)
            } else if (value.state == 3) {
                bind.stateImage.setImageResource(R.drawable.green_armchair)
            }
        }
    }

    override fun onBindViewHolder(holder: HistoryVH, position: Int) {
        holder.load()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryVH =
        HistoryVH(LayoutInflater.from(parent.context).inflate(R.layout.item_seat, parent, false))
}