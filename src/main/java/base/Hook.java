package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ReadProperties;
import static utils.Iconstant.*;

public class Hook {

	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();

	@Before
	public void initBaseClass() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(envVar.getProperties(BROWSER));

	}

	@After
	public void exitingDriver() {
		baseClass.tearUp();

	}

}
