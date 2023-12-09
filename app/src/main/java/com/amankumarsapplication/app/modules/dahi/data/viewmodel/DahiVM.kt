package com.amankumarsapplication.app.modules.dahi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amankumarsapplication.app.modules.dahi.`data`.model.DahiModel
import org.koin.core.KoinComponent

class DahiVM : ViewModel(), KoinComponent {
  val dahiModel: MutableLiveData<DahiModel> = MutableLiveData(DahiModel())

  var navArguments: Bundle? = null
}
