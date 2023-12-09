package com.amankumarsapplication.app.modules.milk.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MilkRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_milk_medium_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADD: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_milk_bottle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)

)
