

package com.danny.mapswithgeofencing.ui.events

import android.location.Location
import com.danny.mapswithgeofencing.ui.calculateroute.DirectionsMode

sealed class CalculateRouteStateEvent {
    class OnFindDirections(
            val hStartLocation: Location? = null,
            val hDestinationLocation: Location,
            val hMode: DirectionsMode,
    ) : CalculateRouteStateEvent()

    class OnSwitchPlaces : CalculateRouteStateEvent()

    class OnMapReady : CalculateRouteStateEvent()

    class OnModeChanged(val hMode: DirectionsMode) : CalculateRouteStateEvent()

    class None : CalculateRouteStateEvent()

}