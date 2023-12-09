package com.amankumarsapplication.app.modules.cart.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? =
      MyApp.getInstance().resources.getString(R.string.msg_milk_medium_fat3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_302)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouhaveap: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_you_have_a_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosedelivery: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStandardFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_standard_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosePayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_payment)

)
