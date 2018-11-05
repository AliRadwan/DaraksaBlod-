package com.example.wekaradwan.daraksablood;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager_id);
        tabLayout = findViewById(R.id.tablayout_id);



        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new Fragment_A_Negative(),"");
        adapter.AddFragment(new Fragment_A_Positive(),"");
        adapter.AddFragment(new Fragment_B_Negative(),"");
        adapter.AddFragment(new Fragment_B_Positive(),"");
        adapter.AddFragment(new Fragment_AB_Negative(),"");
        adapter.AddFragment(new Fragment_AB_Positive(),"");
        adapter.AddFragment(new Fragment_O_Negative(),"");
        adapter.AddFragment(new Fragment_O_Positive(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




        tabLayout.getTabAt(0).setText("A-");
        tabLayout.getTabAt(1).setText("A+");
        tabLayout.getTabAt(2).setText("B-");
        tabLayout.getTabAt(3).setText("B+");
        tabLayout.getTabAt(4).setText("AB-");
        tabLayout.getTabAt(5).setText("AB+");
        tabLayout.getTabAt(6).setText("O-");
        tabLayout.getTabAt(7).setText("O+");



//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation(0);
//        actionBar.setTitle("Weka Just Test");







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_activity_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_favorite){
            Intent intent = new Intent(MainActivity.this,InformationActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
