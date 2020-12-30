package com.poojasingh.reelsfeature.data.model

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.poojasingh.reelsfeature.R
import javax.inject.Inject

class Mock @Inject constructor(private val context: Context) {
    fun loadMockData(): ArrayList<StoriesDataModel>? {
        val mockData = context.resources.openRawResource(R.raw.stories_data)
        val dataString = mockData.bufferedReader().readText()

        val gson = Gson()
        val storiesType = object : TypeToken<ArrayList<StoriesDataModel>>() {}.type
        val storiesDataModelList = gson.fromJson<ArrayList<StoriesDataModel>>(dataString, storiesType)

        return storiesDataModelList
    }
}