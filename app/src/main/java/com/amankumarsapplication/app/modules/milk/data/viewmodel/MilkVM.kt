package com.amankumarsapplication.app.modules.milk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amankumarsapplication.app.modules.milk.`data`.model.MilkModel
import com.amankumarsapplication.app.modules.milk.`data`.model.MilkRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MilkVM : ViewModel(), KoinComponent {
  val milkModel: MutableLiveData<MilkModel> = MutableLiveData(MilkModel())

  var navArguments: Bundle? = null

  val milkList: MutableLiveData<MutableList<MilkRowModel>> = MutableLiveData(mutableListOf())
}
