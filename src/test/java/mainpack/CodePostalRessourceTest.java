package mainpack;
import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.DBI;

import com.adopt.bdd.App;
import com.adopt.bdd.CPDao;
import com.adopt.bdd.Ville;

public class CodePostalRessourceTest extends JerseyTest {
	private static CPDao dao;
	
	@Override
    protected Application configure() {
		App app = new App();
		@SuppressWarnings("static-access")
		DBI dbi = app.getDbi();
		dao = dbi.open(CPDao.class);
        return new App();
    }
	
	@Before
	public void init () {
		dao.dropCpTable();
		dao.createCpTable();			
	}
	
	@Test
	public void testRechercheVilles() {
		List<Ville> villes = target("/cpdb/59147").request().get(new GenericType<List<Ville>>(){});
		assertEquals(3, villes.size());
	}
	
	@Test
	public void testAllVilles() {
		List<Ville> villes = target("/cpdb").request().get(new GenericType<List<Ville>>(){});
		assertEquals(656, villes.size());
	}
	
}