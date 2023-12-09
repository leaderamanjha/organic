package com.amankumarsapplication.app.modules.milk.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MilkModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMILK: String? = MyApp.getInstance().resources.getString(R.string.lbl_milk2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFRUITSANDVEGI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fruits_and_vegi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFRUITSANDVEGIOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fruits_and_vegi)

)
