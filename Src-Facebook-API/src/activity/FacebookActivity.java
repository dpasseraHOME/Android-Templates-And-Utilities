package com.example.activity;

import android.content.Intent;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Window;
import com.example.R;
import com.example.fragment.FacebookFragment;


public class FacebookActivity extends SherlockFragmentActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		setContentView(R.layout.activity_facebook);
	}

	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		super.onActivityResult(requestCode, resultCode, data);
		
		// facebook activity result
		FacebookFragment facebookFragment = (FacebookFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_facebook);
		if(facebookFragment!=null) facebookFragment.facebookActivityResult(requestCode, resultCode, data);
	}
}
