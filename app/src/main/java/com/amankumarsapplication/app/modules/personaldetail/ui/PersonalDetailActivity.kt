package com.amankumarsapplication.app.modules.personaldetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityPersonalDetailBinding
import com.amankumarsapplication.app.modules.cart.ui.CartActivity
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.personaldetail.`data`.viewmodel.PersonalDetailVM
import com.amankumarsapplication.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

class PersonalDetailActivity :
    BaseActivity<ActivityPersonalDetailBinding>(R.layout.activity_personal_detail) {
  private val viewModel: PersonalDetailVM by viewModels<PersonalDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogout.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFastCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
