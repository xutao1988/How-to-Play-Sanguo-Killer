package com.xuhu.com;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class PlayIndroduce extends ListActivity{
	private int[] mPlaIntroduceTitles = new int[]{R.string.play_type_identify, R.string.play_type_three_to_there, R.string.play_type_one_to_one};
	private ListView mList;
	private PlayIntroduceListAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_introduce_layout);
		init();
	}
	
	private void init() {
		mList = getListView();
		Resources res = getResources();
		List<String> titles = new ArrayList<String>();
		for(Integer id:mPlaIntroduceTitles) {
			titles.add(res.getString(id));
		}
		mAdapter = new PlayIntroduceListAdapter(this, titles);
		mList.setAdapter(mAdapter);
	}

}
