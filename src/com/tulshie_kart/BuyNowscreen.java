package com.tulshie_kart;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;

public class BuyNowscreen extends ActionBarActivity {

	Button button;
	Boolean flag = false;
	Menu mainMenu = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.i);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setDisplayUseLogoEnabled(true);

		setContentView(R.layout.activity_buy_nowscreen);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		setIntent(getIntent());
		try {
			ViewConfiguration config = ViewConfiguration.get(this);
			java.lang.reflect.Field menuKeyField = ViewConfiguration.class
					.getDeclaredField("sHasPermanentMenuKey");
			if (menuKeyField != null) {
				menuKeyField.setAccessible(true);
				menuKeyField.setBoolean(config, false);
			}
		} catch (Exception ex) {
			// Ignore
		}

		button = (Button) findViewById(R.id.button2);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(BuyNowscreen.this,
						Buynowclick.class);
				startActivity(myIntent);
			}
		});

	}

	public void change_image(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.one);
	}

	public void change_image1(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.two);
	}

	public void change_image2(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.three);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		// Inflate menu to add items to action bar if it is present.
		inflater.inflate(R.menu.buy_nowscreen, menu);
		// Associate searchable configuration with the SearchView
		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
		SearchView searchView = (SearchView) menu.findItem(R.id.menu_search)
				.getActionView();
		// searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
		mainMenu = menu;

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.setting:
			// Intent intent = new Intent(this, Mycart.class);
			// this.startActivity(intent);
			break;
		case R.id.myacconut:
			Intent intent1 = new Intent(this, Profile.class);
			this.startActivity(intent1);
			break;
		case R.id.mycart1:
			Intent intent2 = new Intent(this, Mycart.class);
			this.startActivity(intent2);
			break;
		case R.id.mycart:
			Intent intent3 = new Intent(this, Mycart.class);
			this.startActivity(intent3);
			break;
		case R.id.notification:
			// Intent intent4 = new Intent(this, Mycart.class);
			// this.startActivity(intent4);
			break;
		case R.id.logout:
			// Intent intent5 = new Intent(this, Mycart.class);
			// this.startActivity(intent5);
			break;

		default:
			return super.onOptionsItemSelected(item);
		}

		return true;
	}

}
