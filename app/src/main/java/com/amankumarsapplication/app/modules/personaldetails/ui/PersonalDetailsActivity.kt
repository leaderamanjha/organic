package com.amankumarsapplication.app.modules.personaldetails.ui

import androidx.activity.viewModels
import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.base.BaseActivity
import com.amankumarsapplication.app.databinding.ActivityPersonalDetailsBinding
import com.amankumarsapplication.app.modules.categories.ui.CategoriesActivity
import com.amankumarsapplication.app.modules.personaldetails.`data`.viewmodel.PersonalDetailsVM
import com.amankumarsapplication.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

class PersonalDetailsActivity :
    BaseActivity<ActivityPersonalDetailsBinding>(R.layout.activity_personal_details) {
  private val viewModel: PersonalDetailsVM by viewModels<PersonalDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBack.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnframeten.setOnClickListener {
      val destIntent = CategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_DETAILS_ACTIVITY"

  }
}
