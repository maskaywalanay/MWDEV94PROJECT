package illegaller.aida.dev.art.prefxml;
import android.preference.*;
import android.os.*;

public class PreferenceXml extends PreferenceActivity
{
    
    // membuat activity pertama di buat //
    
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
         // memanggil file xml dari folder xml //
        addPreferencesFromResource(R.xml.preference_xml_confg);
    }
    
    
}
