package com.galmax.runaway.core.connectivity.domain.messaging

import com.galmax.core.domain.util.Error

enum class MessagingError : Error {
    CONNECTION_INTERRUPTED,
    DISCONNECTED,
    UNKNOWN
}