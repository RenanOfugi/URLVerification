package verification;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VerificationSectionsTest {

	VerificationSections section;
	String url;
	
	@Before
	public void initialize(){
		
		url = "http://www.google.com/mail/user=fulano";
		section = new VerificationSections();
	}
	
	@Test
	public void testVerificarProtocolo() {
		
		assertTrue("Url começa com http", section.verificaProtocolo(url));
	}
	
	@Test
	public void testVerificaDominio(){
		
	}

}
