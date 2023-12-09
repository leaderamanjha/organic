package com.amankumarsapplication.app.modules.milk.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.databinding.RowMilkBinding
import com.amankumarsapplication.app.modules.milk.`data`.model.MilkRowModel
import kotlin.Int
import kotlin.collections.List

class MilkAdapter(
  var list: List<MilkRowModel>
) : RecyclerView.Adapter<MilkAdapter.RowMilkVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMilkVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_milk,parent,false)
    return RowMilkVH(view)
  }

  override fun onBindViewHolder(holder: RowMilkVH, position: Int) {
    val milkRowModel = MilkRowModel()
    // TODO uncomment following line after integration with data source
    // val milkRowModel = list[position]
    holder.binding.milkRowModel = milkRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MilkRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MilkRowModel
    ) {
    }
  }

  inner class RowMilkVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMilkBinding = RowMilkBinding.bind(itemView)
    init {
      binding.linearColumnfavorite.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MilkRowModel())
      }
    }
  }
}
