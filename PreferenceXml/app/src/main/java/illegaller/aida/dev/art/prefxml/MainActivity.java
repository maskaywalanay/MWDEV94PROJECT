package illegaller.aida.dev.art.prefxml;

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
    
    // buat menu //
    // buat panggilan menu saat di klik //
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // TODO: Implement this method
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // TODO: Implement this method
        if(item.getItemId() == R.id.item)
        {
            // panggil kelas yang baru di buat untuk meng- extends preferenceActivity // 
            startActivity(new Intent(this,PreferenceXml.class));
        }
        return super.onOptionsItemSelected(item);
    }
    
    
    
}
