package com.amankumarsapplication.app.modules.categories.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThereisnoord: String? =
      MyApp.getInstance().resources.getString(R.string.msg_there_is_no_ord)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDITEMS: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlacedailyord: String? =
      MyApp.getInstance().resources.getString(R.string.msg_place_daily_ord)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaperson: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_person)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivatetheva: String? =
      MyApp.getInstance().resources.getString(R.string.msg_activate_the_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeizethrilling: String? =
      MyApp.getInstance().resources.getString(R.string.msg_seize_thrilling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopByCategor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shop_by_categor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilk: String? = MyApp.getInstance().resources.getString(R.string.lbl_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurd: String? = MyApp.getInstance().resources.getString(R.string.lbl_curd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButterMilk: String? = MyApp.getInstance().resources.getString(R.string.lbl_butter_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGHEE: String? = MyApp.getInstance().resources.getString(R.string.lbl_ghee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaneer: String? = MyApp.getInstance().resources.getString(R.string.lbl_paneer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGheeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ghee2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButter: String? = MyApp.getInstance().resources.getString(R.string.lbl_butter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMostPopularPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_most_popular_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProducts: String? = MyApp.getInstance().resources.getString(R.string.lbl_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalletOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_reffer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)

)
