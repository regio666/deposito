import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class DepositoSFP {
	
	private DepositoCombustible tank;
	private double get;
	private boolean getCondicion;
	
	
	
	@Before
	public void declaracion() {
		tank = new DepositoCombustible(40.0,0.0);
	}
	@After
	public void fin() {
		tank=null;
	}
	
	@Test
	public void testGetDepositoNivel() {
		
		get=tank.getDepositoNivel();
		assertEquals(0.0,get,0);		
	}

	@Test
	public void testGetDepositoMax() {
		
		get=tank.getDepositoMax();
		assertEquals(40.0,get,0);
	}

	@Test
	public void testEstaVacio() {
		getCondicion=tank.estaVacio();
		assertTrue(getCondicion);
	}

	@Test
	public void testEstaLleno() {
		tank.fill(40.0);
		getCondicion=tank.estaLleno();
		assertTrue(getCondicion);
	}
	
	@Test
	public void testLlenoMitad() {
	
		tank.fill(20.0);
		assertEquals(20.0, tank.getDepositoMax()/2,0);
	}

	


}
