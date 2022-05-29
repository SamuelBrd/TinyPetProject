package foo;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@WebServlet(name = "petitionRemoveAll", urlPatterns = { "/petitionRemoveAll" })
public class PetitionRemoveAll extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

        Query s = new Query("Signature");
		PreparedQuery ps = datastore.prepare(s);
		List<Entity> results = ps.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : results) {
			datastore.delete(entity.getKey());			
			response.getWriter().print("<li> deleting" + entity.getKey()+"<br>");
		}

		Query q = new Query("Petition");
		PreparedQuery pq = datastore.prepare(q);
		List<Entity> resultp = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : resultp) {
			datastore.delete(entity.getKey());			
			response.getWriter().print("<li> deleting" + entity.getKey()+"<br>");
		}
                
		Query u = new Query("User");
		PreparedQuery pu = datastore.prepare(u);
		List<Entity> resultu = pu.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : resultu) {
			datastore.delete(entity.getKey());			
			response.getWriter().print("<li> deleting" + entity.getKey()+"<br>");
		}  
	}
}
