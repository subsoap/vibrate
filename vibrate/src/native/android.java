package com.defold.android.vibrate;

import android.os.Vibrator;
import android.content.Context;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Vibrate {

    public static final void vibratePhone(Context context, int vibrateMilliSeconds) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		if (vibrator.hasVibrator()) {
			vibrator.vibrate(vibrateMilliSeconds);
		}
    }


    public static final void cancelVibratePhone(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		if (vibrator.hasVibrator()) {
			vibrator.cancel();
		}
    }
}
