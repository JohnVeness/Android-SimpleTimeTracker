package com.example.util.simpletimetracker.feature_records.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.util.simpletimetracker.feature_records.view.RecordsFragment
import com.example.util.simpletimetracker.navigation.params.screen.RecordsParams

class RecordsContainerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    // "Infinite" pager.
    override fun getItemCount(): Int =
        Int.MAX_VALUE

    override fun createFragment(position: Int): Fragment {
        val shift = position - FIRST
        return RecordsFragment.newInstance(
            RecordsParams(shift = shift)
        )
    }

    companion object {
        // First page is at the center of range.
        const val FIRST = Int.MAX_VALUE / 2
    }
}