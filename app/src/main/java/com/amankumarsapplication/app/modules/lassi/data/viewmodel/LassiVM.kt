package com.amankumarsapplication.app.modules.lassi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amankumarsapplication.app.modules.lassi.`data`.model.LassiModel
import org.koin.core.KoinComponent

class LassiVM : ViewModel(), KoinComponent {
  val lassiModel: MutableLiveData<LassiModel> = MutableLiveData(LassiModel())

  var navArguments: Bundle? = null
}
