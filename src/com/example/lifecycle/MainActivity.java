package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	private static final String TAG = "LifeCycle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG,"onCreate is called.");
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		Log.v(TAG,"onStart is called.");
	}

	@Override
	public void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		Log.v(TAG,"onRestart is called.");
	}

	@Override
	public void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Log.v(TAG,"onResume is called.");
	}

	@Override
	public void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
		Log.v(TAG,"onPause is called.");
	}

	@Override
	public void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
		Log.v(TAG,"onStop is called.");
	}

	@Override
	public void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
		Log.v(TAG,"onDestroy is called.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
