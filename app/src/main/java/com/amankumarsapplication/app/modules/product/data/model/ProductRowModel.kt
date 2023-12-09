package com.amankumarsapplication.app.modules.product.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_milk_low_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_milk_full_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDOne2: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)

)
