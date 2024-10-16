package com.galmax.core.connectivity.data

import com.galmax.runaway.core.connectivity.domain.DeviceNode
import com.google.android.gms.wearable.Node

fun Node.toDeviceNode(): DeviceNode {
    return DeviceNode(
        id = id,
        displayName = displayName,
        isNearby = isNearby
    )
}