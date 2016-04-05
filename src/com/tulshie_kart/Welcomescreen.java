package com.tulshie_kart;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class Welcomescreen extends Activity {
	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		Window window = getWindow();
		window.setFormat(PixelFormat.RGBA_8888);
	}

	/** Called when the activity is first created. */
	Thread splashTread;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcomescreen);
		StartAnimations();

	}

	private void StartAnimations() {
		Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
		anim.reset();
		RelativeLayout r = (RelativeLayout) findViewById(R.id.lin_lay);
		r.clearAnimation();
		r.startAnimation(anim);

		anim = AnimationUtils.loadAnimation(this, R.anim.translate);
		anim.reset();
		ImageView iv = (ImageView) findViewById(R.id.splash);
		TextView tv=(TextView) findViewById(R.id.text);
		iv.clearAnimation();
		iv.startAnimation(anim);

		splashTread = new Thread() {
			@Override
			public void run() {
				try {
					int waited = 0;
					// Splash screen pause time
					while (waited < 3500) {
						sleep(100);
						waited += 100;
					}
					Intent intent = new Intent(Welcomescreen.this,
							Secondscreen.class);
					intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
					startActivity(intent);
					Welcomescreen.this.finish();
				} catch (InterruptedException e) {
					// do nothing
				} finally {
					Welcomescreen.this.finish();
				}

			}
		};
		splashTread.start();

	}

}