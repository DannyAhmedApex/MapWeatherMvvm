

package com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates

import android.content.Context
import androidx.lifecycle.*
import com.danny.mapswithgeofencing.R
import com.danny.mapswithgeofencing.db.entities.Templates
import com.danny.mapswithgeofencing.repository.local.LocalRepo
import com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates.TemplatesStateEvent.OnSaveTemplate
import com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates.TemplatesStateEvent.OnViewReady
import com.danny.mapswithgeofencing.ui.geofencescontactstemplates.templates.TemplatesViewState.TemplatesFields
import com.danny.mapswithgeofencing.utils.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TemplatesViewModel @Inject constructor(
        @ApplicationContext private val hContext: Context,
        private val hLocalRepo: LocalRepo,
) : ViewModel() {
    private val _hTemplatesViewState = MutableLiveData<TemplatesViewState>()
    private val _hTemplatesStateEvent = MutableLiveData<TemplatesStateEvent>()

    val hTemplatesViewState: LiveData<TemplatesViewState>
        get() = _hTemplatesViewState

    val hData: LiveData<DataState<TemplatesViewState>> = Transformations
            .switchMap(_hTemplatesStateEvent) {
                hSetStateEvent(it)
            }


    fun hSetStateEvent(templatesStateEvent: TemplatesStateEvent): LiveData<DataState<TemplatesViewState>>? {
        when (templatesStateEvent) {
            is OnViewReady -> {
                hGetDefaultnCustomTemplates()
            }
            is OnSaveTemplate -> {
                hSaveTemplate(templatesStateEvent.message)
            }
        }
        return null
    }

    private fun hGetDefaultnCustomTemplates() {
        val hDefaultTemplatesList = hContext.resources
                .getStringArray(R.array.default_templates_array).toList()

        viewModelScope.launch {
            val hCustomTemplatesList = hLocalRepo.hGetTemplates()
            _hTemplatesViewState.value = TemplatesViewState(
                    hTemplatesFields = TemplatesFields(
                            hSetStartDataVS = TemplatesViewState.SetStartDataVS(
                                    hDefaultTempList = hDefaultTemplatesList,
                                    hCustomTempList = hCustomTemplatesList
                            )
                    )
            )
        }
    }

    private fun hSaveTemplate(template: String) {
        val hTemplate = Templates(hMessage = template)
        viewModelScope.launch {
            hLocalRepo.hInsertTemplate(hTemplate)


            val hCustomTemplatesList = hLocalRepo.hGetTemplates()
            _hTemplatesViewState.value = TemplatesViewState(
                    hTemplatesFields = TemplatesFields(
                            hSetStartDataVS = TemplatesViewState.SetStartDataVS(
                                    hCustomTempList = hCustomTemplatesList
                            )
                    )
            )

        }
    }

}