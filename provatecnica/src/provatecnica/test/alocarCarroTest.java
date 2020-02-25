package provatecnica.test;

import provatecnica.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class alocarCarroTest {
	public alocarCarro alocar;
	
	@Before
	public void criaAmbiente() {
		this.alocar=new alocarCarro();
	}
	
	
	@Test
	public void testIsAlocar() {
		String resp=alocar.alocar(1);
		Assert.assertEquals("FERRARI:WhestCar", resp);
		
		
		resp=alocar.alocar(0);
		Assert.assertNull(resp);
		
		resp=alocar.alocar(-1);
		Assert.assertNull(resp);
		
		
		
		
	}
}
