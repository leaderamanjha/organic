package com.amankumarsapplication.app.modules.personaldetails.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFullname: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMAIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMOBILENUMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_pin_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_proceed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyTwoOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyTwoTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyTwoThreeValue: String? = null
)
