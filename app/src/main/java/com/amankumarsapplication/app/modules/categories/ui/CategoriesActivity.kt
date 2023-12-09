package com.amankumarsapplication.app.modules.categories.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityCategoriesBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.`data`.model.CategoriesRowModel
import com.amankumarsapplication.app.modules.categories.`data`.viewmodel.CategoriesVM
import com.amankumarsapplication.app.modules.product.ui.ProductActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriesActivity : BaseActivity<ActivityCategoriesBinding>(R.layout.activity_categories) {
  private val viewModel: CategoriesVM by viewModels<CategoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val categoriesAdapter = CategoriesAdapter(viewModel.categoriesList.value?:mutableListOf())
    binding.recyclerCategories.adapter = categoriesAdapter
    categoriesAdapter.setOnItemClickListener(
    object : CategoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriesRowModel) {
        onClickRecyclerCategories(view, position, item)
      }
    }
    )
    viewModel.categoriesList.observe(this) {
      categoriesAdapter.updateData(it)
    }
    binding.categoriesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCategories(
    view: View,
    position: Int,
    item: CategoriesRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnfavorite -> {
        val destIntent = ProductActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CATEGORIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CategoriesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
