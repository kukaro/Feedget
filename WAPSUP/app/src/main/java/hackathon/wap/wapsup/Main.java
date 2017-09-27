package hackathon.wap.wapsup;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    ViewPager pager;
    Toolbar toolbar;
    TextView titleName;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle("HOME");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        pager = (ViewPager) findViewById(R.id.viewpager);
        setUpViewPager(pager);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home:
                    toolbar.setTitle(adapter.getPageTitle(0));
                    pager.setCurrentItem(0);
                    return true;
                case R.id.market:
                    toolbar.setTitle(adapter.getPageTitle(1));
                    pager.setCurrentItem(1);
                    return true;

            }
            return false;
        }

    };

    public void setUpViewPager(ViewPager pager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new MainPage1(), "HOME");
        adapter.addFragment(new MainPage2(), "MARKET");
        pager.setAdapter(adapter);

    }
}
