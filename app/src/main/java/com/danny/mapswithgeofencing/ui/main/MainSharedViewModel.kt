

package com.danny.mapswithgeofencing.ui.main

import androidx.lifecycle.ViewModel
import com.danny.mapswithgeofencing.repository.remote.RemoteRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainSharedViewModel @Inject constructor(
        private val hRemoteRepo: RemoteRepo
) : ViewModel()