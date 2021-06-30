package com.example.scanner_impl.routing

import com.example.scanner_impl.presentation.view.ScannerHelpFragment
import com.example.scanner_impl.presentation.view.ScannerMainFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal object ScannerRoutingScreens {
    fun scannerMain() = FragmentScreen {
        ScannerMainFragment()
    }

    fun scannerHelp() = FragmentScreen {
        ScannerHelpFragment()
    }
}