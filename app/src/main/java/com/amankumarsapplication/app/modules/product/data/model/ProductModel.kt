package com.amankumarsapplication.app.modules.product.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? =
      MyApp.getInstance().resources.getString(R.string.msg_milk_medium_fat2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThemilkproduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_milk_produc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADD: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBenefits: String? = MyApp.getInstance().resources.getString(R.string.lbl_benefits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelatedProduct: String? =
      MyApp.getInstance().resources.getString(R.string.msg_related_product)

)
