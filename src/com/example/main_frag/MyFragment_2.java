package com.example.main_frag;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MyFragment_2 extends Fragment implements OnClickListener{
	private Button btn_recommend,btn_My_wardrobe,btn_Mystyle;
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
	private FragmentManager manager;
	private FragmentTransaction transaction;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
				
				
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View root_view = inflater.inflate(R.layout.activity_main, null);
		View view = inflater.inflate(R.layout.my_down_fragment, null);
		manager = getFragmentManager();

		btn_recommend = (Button)root_view.findViewById(R.id.btn_recommend);
		btn_recommend.setOnClickListener(this);
/*		btn_recommend.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub   
				transaction = manager.beginTransaction();
				MyFragment_1 myFragment = new MyFragment_1();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.downFrag, myFragment);
				transaction.commit();
			}
		});*/
		btn_My_wardrobe = (Button)root_view.findViewById(R.id.btn_My_wardrobe);
		btn_My_wardrobe.setOnClickListener(this);
/*		btn_My_wardrobe.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				transaction = manager.beginTransaction();
				MyFragment_2 myFragment = new MyFragment_2();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.downFrag, myFragment);
				transaction.commit();
			}
		});*/
		btn_Mystyle = (Button)root_view.findViewById(R.id.btn_Mystyle);
		btn_Mystyle.setOnClickListener(this);
/*		btn_Mystyle.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				transaction = manager.beginTransaction();
				MyFragment_3 myFragment = new MyFragment_3();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.downFrag, myFragment);
				transaction.commit();
			}
		});*/
		
		transaction = manager.beginTransaction();
		transaction.add(R.id.rightFrag, new MyFragment_2_1());
		transaction.commit();
		
		btn1 = (Button)view.findViewById(R.id.button1);
		btn1.setOnClickListener(this);
/*		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				transaction = manager.beginTransaction();
				MyFragment_2_1 myFragment = new MyFragment_2_1();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.rightFrag, myFragment);
				transaction.commit();
			}
		});*/
		btn2 = (Button)view.findViewById(R.id.button2);
		btn2.setOnClickListener(this);
/*		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				transaction = manager.beginTransaction();
				MyFragment_2_2 myFragment = new MyFragment_2_2();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.rightFrag, myFragment);
				transaction.commit();
			}
		});*/
		btn3 = (Button)view.findViewById(R.id.button3);
		btn3.setOnClickListener(this);
/*		btn3.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				transaction = manager.beginTransaction();
				MyFragment_2_3 myFragment = new MyFragment_2_3();
				//transaction.add(R.id.rightFrag, myFragment);
				transaction.replace(R.id.rightFrag, myFragment);
				transaction.commit();
			}
		});*/
		return view;		
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
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
			
		case R.id.button1:
			transaction.replace(R.id.rightFrag, new MyFragment_2_1());
			transaction.commit();
			break;
		case R.id.button2:
			transaction.replace(R.id.rightFrag, new MyFragment_2_2());
			transaction.commit();
			break;
		case R.id.button3:
			transaction.replace(R.id.rightFrag, new MyFragment_2_3());
			transaction.commit();
			break;
		}
	}

	
}
