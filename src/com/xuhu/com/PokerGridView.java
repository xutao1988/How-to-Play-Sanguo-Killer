package com.xuhu.com;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class PokerGridView extends Activity{
	GridView gridView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pokergridview);
		gridView = (GridView) findViewById(R.id.gridview);
		
		ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();  
	 
        HashMap<String, Object> map = new HashMap<String, Object>();  
        map.put("ItemImage", R.drawable.sha);//添加图像资源的ID  
        map.put("ItemText", "杀");//按序号做ItemText  
        lstImageItem.add(map);
        
        HashMap<String, Object> map1 = new HashMap<String, Object>(); 
        map.put("ItemImage", R.drawable.shan);//添加图像资源的ID  
        map.put("ItemText", "闪");//按序号做ItemText  
        lstImageItem.add(map1);
        
        HashMap<String, Object> map2 = new HashMap<String, Object>(); 
        map.put("ItemImage", R.drawable.tao);//添加图像资源的ID  
        map.put("ItemText", "桃");//按序号做ItemText
        lstImageItem.add(map2);
	    
	    SimpleAdapter saImageItems = new SimpleAdapter(this, lstImageItem, R.layout.gridviewitem, 
	                                                new String[] {"ItemImage","ItemText"},   
	                                                new int[] {R.id.ItemImage,R.id.ItemText});  
	    gridView.setAdapter(saImageItems);
	}
}
