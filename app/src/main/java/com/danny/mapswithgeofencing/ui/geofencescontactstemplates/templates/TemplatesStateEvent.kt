

package com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates

sealed class TemplatesStateEvent {
    class OnViewReady : TemplatesStateEvent()

    class OnSaveTemplate(
            val message: String
    ) : TemplatesStateEvent()
}