package com.xuhu.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PokerIndroduce extends Activity {
	ImageView basePoker = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pokerindroduce);
		
		basePoker = (ImageView) findViewById(R.id.basepoker);
		basePoker.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PokerIndroduce.this, PokerGridView.class);
				startActivity(intent);
				
			}
		});
		
	}

}
