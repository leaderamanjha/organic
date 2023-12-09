package com.amankumarsapplication.app.modules.dahi.ui

import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityDahiBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.dahi.`data`.viewmodel.DahiVM
import com.amankumarsapplication.app.modules.personaldetail.ui.PersonalDetailActivity
import kotlin.String
import kotlin.Unit

class DahiActivity : BaseActivity<ActivityDahiBinding>(R.layout.activity_dahi) {
  private val viewModel: DahiVM by viewModels<DahiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dahiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBack.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = PersonalDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DAHI_ACTIVITY"

  }
}
