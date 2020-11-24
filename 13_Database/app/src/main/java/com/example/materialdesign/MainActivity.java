package com.example.materialdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.materialdesign.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
    public static final String sendMessage="com.example.materialapp";
    ProfileDetails details= new ProfileDetails();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayShowTitleEnabled(false);

        ViewPager viewpager = findViewById(R.id.pager);
        viewpager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        TabLayout tabview= findViewById(R.id.tabLayout);
        tabview.setupWithViewPager(viewpager);





    }
    public class ViewPagerAdapter extends FragmentPagerAdapter {


        public ViewPagerAdapter(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @Override
        public Fragment getItem(int posi) {
            switch (posi) {
                case 0:
                    return new FirstFragment(); // Fragment 1
               case 1:
                    return new SecondFragment(); //Fragment 2
               

            }
            return null;
        }

        @Override
        public int getCount()
        {
            return 2; // fragments 3
        }






        @Override
        public CharSequence getPageTitle(int position) {
            String title = getItem(position).getClass().getName();
            return title.subSequence(title.lastIndexOf(".") + 1, title.length());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.ok:
                TextInputEditText name1= findViewById(R.id.txtname);
                name1.setText(details.name);


                MaterialTextView name2= findViewById(R.id.namedisplay);
                name2.setText(name1.getText().toString());

                TextInputEditText email= findViewById(R.id.txtemail);
                email.setText(details.email);

                TextInputEditText phone= findViewById(R.id.txtphonenum);
                phone.setText(details.phone);

                TextInputEditText password= findViewById(R.id.txtpass);
                password.setText(details.password);

                TextInputEditText repassword= findViewById(R.id.txtrepass);
                repassword.setText(details.password);


        }
        return super.onOptionsItemSelected(item);
    }


}