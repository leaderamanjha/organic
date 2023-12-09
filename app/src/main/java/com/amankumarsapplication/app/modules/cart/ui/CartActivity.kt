package com.amankumarsapplication.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityCartBinding
import com.amankumarsapplication.app.modules.cart.`data`.viewmodel.CartVM
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.personaldetail.ui.PersonalDetailActivity
import kotlin.String
import kotlin.Unit

class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      val destIntent = PersonalDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBack.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
