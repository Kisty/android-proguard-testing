package issuerepro.androidproguardtesting;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;

public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
	public ApplicationTest() {
		super(MainActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		getActivity();
	}

	public void testMenu() throws Exception {

		openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

	}
}
