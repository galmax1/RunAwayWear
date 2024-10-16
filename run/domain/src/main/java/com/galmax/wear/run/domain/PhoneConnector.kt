package com.galmax.wear.run.domain

import com.galmax.core.domain.util.EmptyResult
import com.galmax.runaway.core.connectivity.domain.DeviceNode
import com.galmax.runaway.core.connectivity.domain.messaging.MessagingAction
import com.galmax.runaway.core.connectivity.domain.messaging.MessagingError
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface PhoneConnector {
    val connectedDevice: StateFlow<DeviceNode?>
    val messagingActions: Flow<MessagingAction>

    suspend fun sendActionToPhone(action: MessagingAction): EmptyResult<MessagingError>
}