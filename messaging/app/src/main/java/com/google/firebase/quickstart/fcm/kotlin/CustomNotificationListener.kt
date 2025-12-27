package com.google.firebase.quickstart.fcm.kotlin

import android.content.Context
import android.util.Log
import com.google.firebase.messaging.RemoteMessage
import com.microsoft.windowsazure.messaging.notificationhubs.NotificationListener

class CustomNotificationListener : NotificationListener {
    override fun onPushNotificationReceived(context: Context, message: RemoteMessage) {
        val title = message.notification?.title
        val body  = message.notification?.body
        val data  = message.data

        Log.d("ANH", "Title=$title, Body=$body, Data=$data")
    }
}
