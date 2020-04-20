package kr.tjeit.fragmentmore_20200420.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.tjeit.fragmentmore_20200420.fragments.GameListFragment
import kr.tjeit.fragmentmore_20200420.fragments.MainFragment

class MyFragPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return MainFragment()
        }
        else {
            return GameListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}