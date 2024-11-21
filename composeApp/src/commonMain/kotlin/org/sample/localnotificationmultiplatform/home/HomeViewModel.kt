package org.sample.localnotificationmultiplatform.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.sample.localnotificationmultiplatform.platform.NotificationManager

class HomeViewModel(
    private val notificationManager: NotificationManager
): ViewModel() {
    fun executeNotification() {
        viewModelScope.launch {
            notificationManager.showNotification(
                title = "My title",
                description = "This is my description"
            )
        }
    }
}