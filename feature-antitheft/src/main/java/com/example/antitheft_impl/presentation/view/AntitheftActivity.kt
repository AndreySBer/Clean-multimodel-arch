package com.example.antitheft_impl.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.antitheft_impl.di.AntitheftFeatureComponentHolder
import com.example.antitheft_impl.routing.AntitheftRoutingScreens
import com.example.antitheft_api.R
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import javax.inject.Inject

internal class AntitheftActivity : AppCompatActivity() {
    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router
    private lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AntitheftFeatureComponentHolder.getComponent().inject(this)
        navigator = SupportAppNavigator(this, supportFragmentManager, R.id.details)
        setContentView(R.layout.activity_antitheft)
        if (savedInstanceState == null) {
            router.navigateTo(AntitheftRoutingScreens.ANTITHEFT_MAIN)
        }
    }

    /**
     * Attention: Use onResumeFragments() with FragmentActivity (more info)
     * https://github.com/terrakok/Cicerone/issues/31
     */
    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    public override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
        if (isFinishing) {
            AntitheftFeatureComponentHolder.reset()
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount <= 1) {
            finish()
            return
        }
        router.exit()
    }
}