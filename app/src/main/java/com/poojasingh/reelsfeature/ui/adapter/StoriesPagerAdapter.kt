package com.poojasingh.reelsfeature.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.poojasingh.reelsfeature.data.model.StoriesDataModel
import com.poojasingh.reelsfeature.ui.fragment.StoryViewFragment

class StoriesPagerAdapter(fragment: Fragment, val dataList: MutableList<StoriesDataModel> = mutableListOf()) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun createFragment(position: Int): Fragment {
        return StoryViewFragment.newInstance(dataList[position])
    }
}