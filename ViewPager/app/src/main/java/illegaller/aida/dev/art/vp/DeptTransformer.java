package illegaller.aida.dev.art.vp;
import android.support.v4.view.*;
import android.view.*;

public class DeptTransformer implements ViewPager.PageTransformer
{
	private static final float MIN_SCALE = 0.75f;

	@Override
	public void transformPage(View p1, float p2)
	{
		// TODO: Implement this method
		{
			if (p2 <= 0.0f)
			{
				p1.setTranslationX(0.0f);
				p1.setScaleX(1.0f);
				p1.setScaleY(1.0f);
			}
			else if (p2 <= 1.0f)
			{
				float scaleFactor = MIN_SCALE + (0.25f * (1.0f- Math.abs(p2)));
				p1.setAlpha(1.0f - p2);
				p1.setPivotY(0.5f * ((float) p1.getHeight()));
				p1.setTranslationX(((float) p1.getWidth())* ((-p2)));
				p1.setScaleX(scaleFactor);
				p1.setScaleY(scaleFactor);
			}
		}
	}

	
	
}
