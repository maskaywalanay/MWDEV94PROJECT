package illegaller.aida.dev.art.intent;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	//method yang menjalankan onclik //
	public void goPage2(View v)
	{
		Intent i = new Intent(this, Page2.class);
		startActivity(i);
	}
}
