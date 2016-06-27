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


public class MyFragment_3 extends Fragment implements OnClickListener{
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
		btn_My_wardrobe = (Button)root_view.findViewById(R.id.btn_My_wardrobe);
		btn_My_wardrobe.setOnClickListener(this);
		btn_Mystyle = (Button)root_view.findViewById(R.id.btn_Mystyle);
		btn_Mystyle.setOnClickListener(this);
		
		transaction = manager.beginTransaction();
		transaction.add(R.id.rightFrag, new MyFragment_3_1());
		transaction.commit();
		
		btn1 = (Button)view.findViewById(R.id.button1);
		btn1.setText("紳士風");
		btn1.setOnClickListener(this);
		btn2 = (Button)view.findViewById(R.id.button2);
		btn2.setText("淑女風");
		btn2.setOnClickListener(this);
		btn3 = (Button)view.findViewById(R.id.button3);
		btn3.setText("運動風");
		btn3.setOnClickListener(this);
		btn4 = (Button)view.findViewById(R.id.button4);
		btn4.setVisibility(View.INVISIBLE);
		btn5 = (Button)view.findViewById(R.id.button5);
		btn5.setVisibility(View.INVISIBLE);
		btn6 = (Button)view.findViewById(R.id.button6);
		btn6.setVisibility(View.INVISIBLE);
		btn7 = (Button)view.findViewById(R.id.button7);
		btn7.setVisibility(View.INVISIBLE);
		btn8 = (Button)view.findViewById(R.id.button8);
		btn8.setVisibility(View.INVISIBLE);
		btn9 = (Button)view.findViewById(R.id.button9);
		btn9.setVisibility(View.INVISIBLE);
		btn10 = (Button)view.findViewById(R.id.button10);
		btn10.setVisibility(View.INVISIBLE);
		btn11 = (Button)view.findViewById(R.id.button11);
		btn11.setVisibility(View.INVISIBLE);
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
