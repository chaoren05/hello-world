package iflab.test;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {
	MyReceiver receiver;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		Button btn1 = (Button) findViewById(R.id.third_button_1);
		Button btn2 = (Button) findViewById(R.id.third_button_2);
		Button btn3 = (Button) findViewById(R.id.third_button_3);
		
		btn1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setAction("iflab.test.MY_ACTION_RECEIVER2");
				intent.putExtra("message", "来自于广播的消息! ");
				sendBroadcast(intent);
			}
		});
		
		btn2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				IntentFilter filter = new IntentFilter("iflab.test.MY_ACTION_RECEIVER2");
				receiver = new MyReceiver();
				registerReceiver(receiver, filter);
			}
		});
		
		btn3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				unregisterReceiver(receiver);
			}
		});
	}
}
