package com.amankumarsapplication.app.modules.product.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityProductBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.milk.ui.MilkActivity
import com.amankumarsapplication.app.modules.personaldetail.ui.PersonalDetailActivity
import com.amankumarsapplication.app.modules.product.`data`.model.ProductRowModel
import com.amankumarsapplication.app.modules.product.`data`.viewmodel.ProductVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductActivity : BaseActivity<ActivityProductBinding>(R.layout.activity_product) {
  private val viewModel: ProductVM by viewModels<ProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productAdapter = ProductAdapter(viewModel.productList.value?:mutableListOf())
    binding.recyclerProduct.adapter = productAdapter
    productAdapter.setOnItemClickListener(
    object : ProductAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductRowModel) {
        onClickRecyclerProduct(view, position, item)
      }
    }
    )
    viewModel.productList.observe(this) {
      productAdapter.updateData(it)
    }
    binding.productVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBack.setOnClickListener {
      val destIntent = MilkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = PersonalDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerProduct(
    view: View,
    position: Int,
    item: ProductRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
