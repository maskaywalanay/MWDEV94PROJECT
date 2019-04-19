package illegaller.aida.dev.art.onclickexit;

import android.app.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
    }
	
	// memanggil button exit dengan onclick //
	public void onClick(View view)
	{
		finish();
	}
}
