package com.amankumarsapplication.app.modules.home.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFarmTohome: String? = MyApp.getInstance().resources.getString(R.string.lbl_farm_to_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterMobileNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_mobile_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBySigningupy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)

)
