package iflab.test;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String str;
		str = "接收到的广播消息为: " + intent.getStringExtra("message");
		Toast.makeText(context, str, Toast.LENGTH_LONG).show();
		
//		ComponentName componentName = new ComponentName("iflab.test", "iflab.test.ThirdActivity");
//		Intent intent1 = new Intent();
//		intent1.setComponent(componentName);
//		System.out.println(intent1.getComponent());
//		context.startActivity(intent1, Intent.FLAG_ACTIVITY_NEW_TASK);
	}

}
