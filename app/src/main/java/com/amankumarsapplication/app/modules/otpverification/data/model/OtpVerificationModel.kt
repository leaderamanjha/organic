package com.amankumarsapplication.app.modules.otpverification.`data`.model

import com.amankumarsapplication.app.R
import com.amankumarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPVerificatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterOTPsent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_otp_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontreceivet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_receive_t)

)
