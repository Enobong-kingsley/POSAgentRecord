package com.chuks.posagentrecord

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeHostActivity : AppCompatActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        navView= findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_dashboard, R.id.addTransactionFragment2,R.id.addOpeningBalance2,R.id.settingsFragment

            )
        )

//        supportActionBar?.hide()

        navView.setupWithNavController(navController)

        navView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
               R.id.navigation_dashboard -> navController.navigate(R.id.navigation_dashboard)
               R.id.addTransactionFragment2 -> navController.navigate(R.id.addTransactionFragment2)
               R.id.addOpeningBalance2 -> navController.navigate(R.id.addOpeningBalance2)
               R.id.settingsFragment -> navController.navigate(R.id.settingsFragment)
            }
            true
        }
    }

    /**
     * The [onSupportNavigateUp] displays the back arrow and ensures backward navigation
     * */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}