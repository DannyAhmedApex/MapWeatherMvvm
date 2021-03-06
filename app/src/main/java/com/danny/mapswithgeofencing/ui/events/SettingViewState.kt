

package com.danny.mapswithgeofencing.ui.events

data class SettingViewState(
        val hSettingsFields: SettingsFields = SettingsFields(),

        ) {
    data class SettingsFields(
            var hDefaultSavedVS: DefaultSavedVS? = null
    )


    data class DefaultSavedVS(
            val hLanguage: Int? = null,
            val hDistance: Int? = null,
            val hTemprature: Int? = null,
            val hEmergency: Boolean? = null,
            val hTracking: Boolean? = null,
    )
}