package com.example.notifmanager

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotifListenerService : NotificationListenerService() {
    private val TAG = "NotifListener"

    override fun onListenerConnected() {
        super.onListenerConnected()
        Log.i(TAG, "Notification listener connected")
    }

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val pkg = sbn.packageName
        val title = sbn.notification.extras.getCharSequence("android.title")?.toString()
        Log.i(TAG, "Posted from \$pkg : \$title")
        // TODO: store/display notifications in your app UI
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification) {
        Log.i(TAG, "Removed: " + sbn.packageName)
    }
}
