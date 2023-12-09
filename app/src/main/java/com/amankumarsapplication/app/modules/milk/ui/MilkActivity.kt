package com.amankumarsapplication.app.modules.milk.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityMilkBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.milk.`data`.model.MilkRowModel
import com.amankumarsapplication.app.modules.milk.`data`.viewmodel.MilkVM
import com.amankumarsapplication.app.modules.personaldetail.ui.PersonalDetailActivity
import com.amankumarsapplication.app.modules.product.ui.ProductActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MilkActivity : BaseActivity<ActivityMilkBinding>(R.layout.activity_milk) {
  private val viewModel: MilkVM by viewModels<MilkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val milkAdapter = MilkAdapter(viewModel.milkList.value?:mutableListOf())
    binding.recyclerMilk.adapter = milkAdapter
    milkAdapter.setOnItemClickListener(
    object : MilkAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MilkRowModel) {
        onClickRecyclerMilk(view, position, item)
      }
    }
    )
    viewModel.milkList.observe(this) {
      milkAdapter.updateData(it)
    }
    binding.milkVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBack.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = PersonalDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMilk(
    view: View,
    position: Int,
    item: MilkRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnfavorite -> {
        val destIntent = ProductActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "MILK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MilkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
