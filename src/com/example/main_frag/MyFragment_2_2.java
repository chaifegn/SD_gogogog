package com.example.main_frag;

import android.R.color;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MyFragment_2_2 extends Fragment {
	private GridView gridView;
	private ImageAdapter adapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.my_right_fragment, null);
		gridView = (GridView) view.findViewById(R.id.gridview);
		adapter = new ImageAdapter();
		gridView.setBackgroundColor(Color.parseColor("#faf7ea"));
		gridView.setAdapter(adapter);
	    gridView.setOnItemClickListener(new OnItemClickListener(){
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            Toast.makeText(getActivity(), "你按下 "+position,    
	                Toast.LENGTH_SHORT).show();   
	        }

	    });
		return view;		
	}
	
	//圖片資源
	private int[] images={
		R.drawable.b1,
		R.drawable.b2,
		R.drawable.b3,
		R.drawable.b4,
		R.drawable.b5,
		R.drawable.b6,
		R.drawable.b7,
		R.drawable.b8,
		R.drawable.b9
	};
	public class ImageAdapter extends BaseAdapter{
		public ImageAdapter() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return images.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return images[position];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ImageView imageView = null;
			if(convertView==null){
				imageView = new ImageView(getActivity());
			}else{
				imageView = (ImageView) convertView;
			}
			imageView.setLayoutParams(new GridView.LayoutParams(200, 200));//在這裡調整圖片大小!!!
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(5, 5, 5, 5);//設置格子的間距
			imageView.setImageResource(images[position]);			
			return imageView;
		}
		
	}
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
