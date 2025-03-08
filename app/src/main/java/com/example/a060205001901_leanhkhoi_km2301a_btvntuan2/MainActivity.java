package com.example.a060205001901_leanhkhoi_km2301a_btvntuan2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.HomePage;
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.Listbook;
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment.ProfilePage;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.Nav_home);
        bottomNav.setOnItemSelectedListener(navListener);

        Fragment SelectedFragment = new HomePage();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, SelectedFragment).commit();


    }
    private NavigationBarView.OnItemSelectedListener navListener = item -> {
        int itemId = item.getItemId();

        Fragment selectedFRagment = null;

        if (itemId == R.id.Nav_home){
            selectedFRagment = new HomePage();
        }else  if (itemId == R.id.Nav_list){
            selectedFRagment = new Listbook();
        }else  if (itemId == R.id.Nav_person) {
            selectedFRagment = new ProfilePage();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFRagment).commit();

        return true;
    };
}