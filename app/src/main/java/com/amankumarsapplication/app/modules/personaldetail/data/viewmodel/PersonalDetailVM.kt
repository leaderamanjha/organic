package com.amankumarsapplication.app.modules.personaldetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amankumarsapplication.app.modules.personaldetail.`data`.model.PersonalDetailModel
import org.koin.core.KoinComponent

class PersonalDetailVM : ViewModel(), KoinComponent {
  val personalDetailModel: MutableLiveData<PersonalDetailModel> =
      MutableLiveData(PersonalDetailModel())

  var navArguments: Bundle? = null
}
