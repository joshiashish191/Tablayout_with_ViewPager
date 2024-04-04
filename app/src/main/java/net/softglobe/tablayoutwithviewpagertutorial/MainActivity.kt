package net.softglobe.tablayoutwithviewpagertutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewpager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab_layout)
        viewpager = findViewById(R.id.view_pager)
        viewpager.adapter = ViewPagerFragmentAdapter(this)

//        val imageIdList = mutableListOf<Int>(
//            R.drawable.img1,
//            R.drawable.img2,
//            R.drawable.img3
//        )

//        viewpager.apply {
//            adapter = ViewPagerAdapter()
//            (adapter as ViewPagerAdapter).submitList(imageIdList)
//        }

        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            when (position) {
                0 -> tab.text = "Chats"
                1 -> tab.text = "Status"
                2 -> tab.text = "Calls"
            }
        }.attach()

    }
}