package com.tulshie_kart;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SigninScreen extends ActionBarActivity {
Button button;
Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.i);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setDisplayUseLogoEnabled(true);


		setContentView(R.layout.activity_signin_screen);
		button1=(Button) findViewById(R.id.b1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(SigninScreen.this,
						Openingfacebook.class);
				startActivity(myIntent);
			}
		});
		button = (Button) findViewById(R.id.sign);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(SigninScreen.this,
						BuyNowscreen.class);
				startActivity(myIntent);
			}
		});
	}


	}
