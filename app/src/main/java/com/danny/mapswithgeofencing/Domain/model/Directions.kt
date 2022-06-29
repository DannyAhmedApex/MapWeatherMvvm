

package com.danny.mapswithgeofencing.Domain.model

import com.danny.mapswithgeofencing.network.response.directions.*

data class Directions(
        val bounds: Bounds? = null,
        val overviewPolyline: OverviewPolyline? = null,
        val distance: Distance? = null,
        val duration: Duration? = null,
        val endAddress: String? = null,
        val endLocation: EndLocation? = null,
        val startAddress: String? = null,
        val startLocation: StartLocation? = null,
        val steps: List<Step>? = null,
        val status: String? = null,
)