package issuerepro.androidproguardtesting;

import android.test.ActivityInstrumentationTestCase2;


public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
	public ApplicationTest() {
		super(MainActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		getActivity();
	}
}
