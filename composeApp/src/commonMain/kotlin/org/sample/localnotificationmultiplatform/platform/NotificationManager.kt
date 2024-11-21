package org.sample.localnotificationmultiplatform.platform

expect class NotificationManager {
    fun showNotification(
        title: String,
        description: String
    )
}