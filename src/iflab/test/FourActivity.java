package iflab.test;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourActivity extends Activity {
	private MyReceiver receiver;
	private Notification notification;
	private NotificationManager notificationManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);
		Button btn1 = (Button) findViewById(R.id.four_button_1);
		Button btn2 = (Button) findViewById(R.id.four_button_2);
		
		String service = NOTIFICATION_SERVICE;
		notificationManager = (NotificationManager)getSystemService(service);
		
		notification = new Notification();
		notification.icon = R.drawable.ic_launcher;
		notification.tickerText = "Notification测试";
		notification.when = System.currentTimeMillis();
		
		btn1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FourActivity.this, FourActivity.class);
				PendingIntent pendingIntent = PendingIntent.getActivity(FourActivity.this, 0, intent, 0);
				notification.setLatestEventInfo(FourActivity.this, "我的标题", "我的内容", pendingIntent);
				notificationManager.notify(1, notification);
			}
		});
		
		btn2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				notificationManager.cancel(1);
			}
		});

	}
}
