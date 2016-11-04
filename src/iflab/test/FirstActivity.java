package iflab.test;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		Button btn1 = (Button)findViewById(android.R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Uri uri = Uri.parse("tel:10086");
//				Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//				startActivity(intent);
//				ComponentName componentName = new ComponentName(FirstActivity.this, "iflab.test.SecondActivity");
//				ComponentName componentName = new ComponentName(FirstActivity.this, "iflab.test.ThirdActivity");
				ComponentName componentName = new ComponentName("iflab.test", "iflab.test.FourActivity");
				Intent intent = new Intent();
//				intent.setClass(getApplicationContext(), SecondActivity.class);
				intent.setComponent(componentName);
//				intent.setAction("iflab.test.MY_ACTION");
				System.out.println("wuwuwuwuwlalalla");
				System.out.println(intent.getComponent());
				startActivity(intent);
			}
		});
	}
}
