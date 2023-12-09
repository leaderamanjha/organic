package com.amankumarsapplication.app.modules.lassi.ui

import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityLassiBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.lassi.`data`.viewmodel.LassiVM
import com.amankumarsapplication.app.modules.personaldetail.ui.PersonalDetailActivity
import kotlin.String
import kotlin.Unit

class LassiActivity : BaseActivity<ActivityLassiBinding>(R.layout.activity_lassi) {
  private val viewModel: LassiVM by viewModels<LassiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lassiVM = viewModel
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
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LASSI_ACTIVITY"

  }
}
