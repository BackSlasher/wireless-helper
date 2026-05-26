package com.andrerinas.wirelesshelper

enum class ConnectionState(val progress: Int, val label: String) {
    IDLE(0, "Idle"),
    CONNECTING_HOTSPOT(15, "Connecting to hotspot..."),
    HOTSPOT_CONNECTED(30, "Hotspot connected"),
    CONNECTING_HU(50, "Connecting to headunit..."),
    WAITING_FOR_HU(50, "Waiting for headunit..."),
    HU_CONNECTED(75, "Headunit connected"),
    AA_ACTIVE(100, "Android Auto active"),
    ERROR(0, "Error")
}
