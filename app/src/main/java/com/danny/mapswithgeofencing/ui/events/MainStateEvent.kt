

package com.danny.mapswithgeofencing.ui.events

import android.location.Location
import com.google.android.gms.maps.model.Marker
import com.danny.mapswithgeofencing.ui.main.fragments.adapter.Category

sealed class MainStateEvent {

    class OnCurrentLocationFound(val location: Location?) : MainStateEvent()

    class OnCategorySelected(val category: Category) : MainStateEvent()

    class OnFindAutoCompleteSuggestions(val suggestion: String) : MainStateEvent()

    class OnSuggestionSelected(val postion: Int) : MainStateEvent()

    class OnMapReady : MainStateEvent()

    class OnMarkerClicked(val marker: Marker) : MainStateEvent()

    class OnFindRoute() : MainStateEvent()

    class None : MainStateEvent()

}