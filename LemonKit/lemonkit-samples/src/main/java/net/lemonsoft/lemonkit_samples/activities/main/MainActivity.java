package net.lemonsoft.lemonkit_samples.activities.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import net.lemonsoft.lemonkit.annotations.SetContentView;
import net.lemonsoft.lemonkit.base.LKActivity;
import net.lemonsoft.lemonkit.ui.view.LKTabBar;
import net.lemonsoft.lemonkit_samples.R;

@SetContentView(R.layout.activity_main)
public class MainActivity extends LKActivity {

    private TextView myTextView;
    private LKTabBar tabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabBar.setOnTabChangeListener(new LKTabBar.OnTabChangeListener() {
            @Override
            public void onTabChanged(LKTabBar tabBar, int index) {
                System.out.println("current selected: " + index);
            }
        });
        tabBar.getItems().get(0).select();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent().setClass(MainActivity.this, StarterActivity.class));
            }
        }, 1000);
    }

}