package com.adopt.bdd;

import javax.ws.rs.ApplicationPath;

import mainpack.LikeResource;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

@ApplicationPath("/v2/")
public class App extends ResourceConfig {
    
    public App() {
    	packages("com.adopt.bdd");
    	register(LoggingFilter.class);
    	register(LikeResource.class);
    }
    
    public static DBI getDbi() {
		return dbi;
	}
	public static void setDbi(DBI dbi) {
		App.dbi = dbi;
	}

	private static DBI dbi;
	static {
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") + "CP.db");
		setDbi(new DBI(ds));
    }
}
