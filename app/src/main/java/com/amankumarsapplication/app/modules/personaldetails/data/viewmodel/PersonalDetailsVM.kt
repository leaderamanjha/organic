package com.amankumarsapplication.app.modules.personaldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amankumarsapplication.app.modules.personaldetails.`data`.model.PersonalDetailsModel
import org.koin.core.KoinComponent

class PersonalDetailsVM : ViewModel(), KoinComponent {
  val personalDetailsModel: MutableLiveData<PersonalDetailsModel> =
      MutableLiveData(PersonalDetailsModel())

  var navArguments: Bundle? = null
}
