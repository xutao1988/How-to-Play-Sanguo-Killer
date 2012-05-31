package com.xuhu.com;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class HowtoPlaySanguoKillerActivity extends TabActivity {
    /** Called when the activity is first created. */
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TabHost tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("pokerindroduce")
                .setIndicator(getResources().getString(R.string.pokerindroduce))
                .setContent(new Intent(this, PlayIndroduce.class)));

        tabHost.addTab(tabHost.newTabSpec("playindroduce")
                .setIndicator(getResources().getString(R.string.playindroduce))
                .setContent(new Intent(this, PlayIndroduce.class)));
        
        // This tab sets the intent flag so that it is recreated each time
        // the tab is clicked.
        tabHost.addTab(tabHost.newTabSpec("goodarticle")
                .setIndicator(getResources().getString(R.string.goodarticle))
                .setContent(new Intent(this, GoodArticle.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)));
    }
}