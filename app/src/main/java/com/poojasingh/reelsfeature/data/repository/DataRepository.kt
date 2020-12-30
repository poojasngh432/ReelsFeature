package com.poojasingh.reelsfeature.data.repository

import com.poojasingh.reelsfeature.data.model.Mock
import com.poojasingh.reelsfeature.data.model.StoriesDataModel
import javax.inject.Inject

class DataRepository @Inject constructor(private val mock: Mock) {
    fun getStoriesData(): ArrayList<StoriesDataModel>? {
        val dataList = mock.loadMockData()
        return dataList
    }
}