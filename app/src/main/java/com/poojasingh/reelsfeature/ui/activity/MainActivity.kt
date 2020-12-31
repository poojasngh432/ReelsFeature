package com.poojasingh.reelsfeature.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.poojasingh.reelsfeature.R
import com.poojasingh.reelsfeature.base.BaseActivity
import com.poojasingh.reelsfeature.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener {
    private val homeViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        nav_view.setupWithNavController(navController)

        navController.addOnDestinationChangedListener(this)
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {
            R.id.image_view_add_icon -> {
                changeStatusBarColor(R.color.black)
                val colorWhite = ContextCompat.getColorStateList(
                    this,
                    R.color.white
                )

                val colorBlack = ContextCompat.getColorStateList(
                    this,
                    R.color.black
                )

                nav_view.backgroundTintList = colorBlack
                nav_view.itemTextColor = colorWhite
                nav_view.itemIconTintList = colorWhite
            }
            else -> {
                changeStatusBarColor(R.color.black)
                val colorWhite = ContextCompat.getColorStateList(
                    this,
                    R.color.white
                )

                val colorDark = ContextCompat.getColorStateList(
                    this,
                    R.color.black
                )

                nav_view.backgroundTintList = colorDark
                nav_view.itemTextColor = colorWhite
                nav_view.itemIconTintList = colorWhite
            }
        }
    }
}
