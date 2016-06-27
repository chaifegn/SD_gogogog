package com.example.main_frag;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener,OnTouchListener{
	private Button btn_recommend,btn_My_wardrobe,btn_Mystyle;
	private FragmentManager manager;
	private FragmentTransaction transaction;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		manager = getFragmentManager();
		
		btn_recommend = (Button)findViewById(R.id.btn_recommend);
		btn_recommend.setOnClickListener(this);

		btn_My_wardrobe = (Button)findViewById(R.id.btn_My_wardrobe);
		btn_My_wardrobe.setOnClickListener(this);

		btn_Mystyle = (Button)findViewById(R.id.btn_Mystyle);
		btn_Mystyle.setOnClickListener(this);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		transaction = manager.beginTransaction();
		switch (v.getId()) {
		case R.id.btn_recommend:
			transaction.replace(R.id.downFrag, new MyFragment_1());
			transaction.commit();
			break;
		case R.id.btn_My_wardrobe:
			transaction.replace(R.id.downFrag, new MyFragment_2());
			transaction.commit();
			break;
		case R.id.btn_Mystyle:
			transaction.replace(R.id.downFrag, new MyFragment_3());
			transaction.commit();
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
}
