package com.tulshie_kart;



import java.lang.reflect.Method;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Secondscreen extends ActionBarActivity {
Button button;
Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_secondscreen);
		button = (Button) findViewById(R.id.b2);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(Secondscreen.this,
						SigninScreen.class);
				startActivity(myIntent);
			}
		});
		button1=(Button) findViewById(R.id.b1);
button1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent myIntent = new Intent(Secondscreen.this,
				Creataccontscreen.class);
		startActivity(myIntent);
	}
});
	}
	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
	    if(featureId == Window.FEATURE_ACTION_BAR && menu != null) {
	        if(menu.getClass().getSimpleName().equals("MenuBuilder")) {
	            try {
	                Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
	                m.setAccessible(true);
	                m.invoke(menu, true);
	            } catch(NoSuchMethodException e) { //...
	            } catch(Exception e) { // ...
	            }
	        }
	    }
	    return super.onMenuOpened(featureId, menu);
	}


	
	
	
	

}