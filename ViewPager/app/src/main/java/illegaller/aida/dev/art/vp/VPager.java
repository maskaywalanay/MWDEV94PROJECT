package illegaller.aida.dev.art.vp;
import android.content.*;
import android.support.v4.view.*;
import android.util.*;
import java.util.*;
import android.widget.*;
import android.view.*;
import android.os.*;

 class VPager extends ViewPager
{
	private List<String> daftarjudul;
	
	public int setResource(String Name, String Type)
	{
		return getContext().
		getResources().
		getIdentifier(Name, Type, getContext().getPackageName());
	}
	
	public VPager(Context context, AttributeSet attributSet)
	{
		super(context, attributSet);
		
		daftarjudul = new ArrayList<String>();
		
		// jika ingin menambah page tambah baris ini 
		// jangan lupa tambah juga baris di string.xml nya
		daftarjudul.add(getResources().getString(setResource("page_1", "string")));
		daftarjudul.add(getResources().getString(setResource("page_2", "string")));
		daftarjudul.add(getResources().getString(setResource("page_3", "string")));
		daftarjudul.add(getResources().getString(setResource("page_4", "string")));
		daftarjudul.add(getResources().getString(setResource("page_5", "string")));
		
		Adapter adapter = new Adapter (daftarjudul);
		ViewPager VPager = (ViewPager) this.findViewById(setResource("new_view_pager" , "id"));
		
		VPager.setPageTransformer(true, new DeptTransformer());
		VPager.setAdapter(adapter);
		// ubah page limit nya sesuai yang mau diisi 
		VPager.setOffscreenPageLimit(5);
		
	}
	
	public class Adapter extends PagerAdapter
	{
		private List<String>adapterdaftarjudul;
		public Adapter(List <String> listjudul)
		{
			adapterdaftarjudul = listjudul;
		}
		
		@Override
		public int getCount()
		{
			// samakan nilai ini dengan page limit di atas
			return 5;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position)
		{
			// TODO: Implement this method
			int target_idLinearLayout = 0;
			
			switch (position)
			{
				// jika page1 case 0 
				//maka seterusnya di akhiri dengan break;
				case 0:
					target_idLinearLayout = setResource("page_1", "id");
					
					break;
					
				case 1:
					target_idLinearLayout = setResource("page_2", "id");
						
					break ;
					
				case 2:
					target_idLinearLayout = setResource("page_3" , "id");
					
					break;
					
				case 3:
					target_idLinearLayout = setResource("page_4" , "id");
					
					break;
					
				case 4:
					target_idLinearLayout = setResource("page_5", "id");
					
					break;
						
			}
			
			
			return findViewById(target_idLinearLayout);
		}

		@Override
		public CharSequence getPageTitle(int position)
		{
			// TODO: Implement this method
			return adapterdaftarjudul.get(position);
		}

		@Override
		public boolean isViewFromObject(View p1, Object p2)
		{
			// TODO: Implement this method
			return p1 == p2;
		}

		@Override
		public Parcelable saveState()
		{
			// TODO: Implement this method
			return null;
		}
		
	}
	
}
