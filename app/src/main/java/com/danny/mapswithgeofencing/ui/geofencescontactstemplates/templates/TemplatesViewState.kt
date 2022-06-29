

package com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates

import com.danny.mapswithgeofencing.db.entities.Templates

data class TemplatesViewState(
        val hTemplatesFields: TemplatesFields = TemplatesFields()

) {
    data class TemplatesFields(
            val hSetStartDataVS: SetStartDataVS? = null
    )

    data class SetStartDataVS(
            val hDefaultTempList: List<String>? = null,
            val hCustomTempList: List<Templates>? = null
    )

}