package iflab.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Button btn2 = (Button)findViewById(R.id.button2);
		btn2.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
//				intent.setAction(Intent.ACTION_VIEW);
//				System.out.println("2222222222222");
//				Uri data = Uri.parse("http://www.baidu.com");
//				intent.setData(data);
//				startActivity(intent);
				intent.setAction("iflab.test.MY_ACTION_RECEIVER");
				intent.putExtra("message", "来自于广播的消息!");
				sendBroadcast(intent);
			}
			
		});
	}
}
