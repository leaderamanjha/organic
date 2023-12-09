package com.amankumarsapplication.app.modules.lassi.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LassiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLASSI: String? = MyApp.getInstance().resources.getString(R.string.lbl_lassi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lassi_120)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADD: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
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
