package com.example.antitheft_impl.routing

import com.example.antitheft_impl.presentation.view.AntitheftHelpFragment
import com.example.antitheft_impl.presentation.view.AntitheftMainFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal object AntitheftRoutingScreens {
    fun antitheftMain() = FragmentScreen {
        AntitheftMainFragment()
    }

    fun antitheftHelp() = FragmentScreen {
        AntitheftHelpFragment()
    }
}