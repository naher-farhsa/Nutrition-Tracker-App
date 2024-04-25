package com.example.nutrition_tracker_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragment(View v){
        Fragment frag;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(v==findViewById(R.id.burgerBtn)){
            frag = new BlankFragment();
            ft.replace(R.id.fragmentPortion,frag);
            ft.commit();
        }
        if(v==findViewById(R.id.pizzaBtn)){
            frag = new BlankFragment2();
            ft.replace(R.id.fragmentPortion,frag);
            ft.commit();
        }
    }
}
