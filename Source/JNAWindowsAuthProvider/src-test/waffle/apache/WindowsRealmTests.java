package waffle.apache;

import junit.framework.TestCase;

/**
 * @author dblock[at]dblock[dot]org
 */
public class WindowsRealmTests extends TestCase {
	
	public void testProperties() {
		WindowsRealm realm = new WindowsRealm();
		assertNull(realm.getPassword(null));
		assertNull(realm.getPrincipal(null));
		assertEquals("waffle.apache.WindowsRealm/1.0", realm.getName());
	}
}
