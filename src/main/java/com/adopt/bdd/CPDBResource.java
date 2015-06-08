package com.adopt.bdd;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

@Path("/cpdb")
@Produces(MediaType.APPLICATION_JSON)
public class CPDBResource {
	
	private final InputStream fichier = getClass().getResourceAsStream("../../../villes_france.csv");
	
	private static CPDao dao = App.dbi.open(CPDao.class);

	public CPDBResource() {
		dao.dropCpTable();
		dao.createCpTable();
		List<Integer> code = new ArrayList<Integer>();
		List<String> ville = new ArrayList<String>();
		
		try {
			InputStreamReader ipsr=new InputStreamReader(fichier);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				String[] tab = ligne.split(",");
				System.out.println(""+Integer.parseInt(tab[0])+tab[1]);
				code.add(Integer.parseInt(tab[0]));
				ville.add(tab[1]);
			}
			br.close();
			dao.load(code, ville);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("/{name}")
	public List<Ville> getUser(@PathParam("name") int name) {
		List<Ville> ville = dao.findByName(name);
		if (ville == null) {
			throw new WebApplicationException(404);
		}
		return ville;
	}
	
	@GET
	public List<Ville> getAllVille() {
		return dao.all();
	}


}
