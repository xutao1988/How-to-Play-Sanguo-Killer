package com.xuhu.com;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PlayIntroduceListAdapter extends ArrayAdapter<String> {

	private List<String> mTitles;
	private Context mContext;
	
	public PlayIntroduceListAdapter(Context context, List<String> titles) {
		super(context, 0);
		// TODO Auto-generated constructor stub
		mTitles = titles;
		mContext = context;
	}

	@Override
	public Context getContext() {
		// TODO Auto-generated method stub
		return mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mTitles.size();
	}

	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return mTitles.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = LayoutInflater.from(mContext);
		View view = inflater.inflate(R.layout.play_introduce_list_item, null);
		TextView title = (TextView)view.findViewById(R.id.title);
		title.setText(mTitles.get(position));
		return view;
	}

}
