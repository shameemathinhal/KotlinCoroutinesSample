package com.shameem.projectstructure.utils

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shameem.projectstructure.data.api.ApiHelper
import com.shameem.projectstructure.ui.home.HomeViewModel

class ViewModelFactory(private val apiHelper: ApiHelper,
                       private val context: Context) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(apiHelper,context) as T
        }

        throw IllegalArgumentException("Unknown class name")
    }

}