package com.example.a060205001901_leanhkhoi_km2301a_btvntuan2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.HomePage
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.Listbook
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.ProfilePage
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.Nav_home
        bottomNav.setOnItemSelectedListener(navListener)

        val selectedFragment: Fragment = HomePage()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()
    }

    private val navListener = NavigationBarView.OnItemSelectedListener { item ->
        val selectedFragment: Fragment? = when (item.itemId) {
            R.id.Nav_home -> HomePage()
            R.id.Nav_list -> Listbook()
            R.id.Nav_person -> ProfilePage()
            else -> null
        }

        selectedFragment?.let {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, it).commit()
            true
        } ?: false
    }
}
