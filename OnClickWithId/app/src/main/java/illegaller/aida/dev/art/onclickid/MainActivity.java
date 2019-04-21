package illegaller.aida.dev.art.onclickid;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//memanggil onClick dengan id btn_exit//
		Button btn_exit = (Button)findViewById(R.id.btn_exit);
		btn_exit.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					finish();
				}
				
		});
		
    }
	
	
	
	
}
