package tips.java.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("login")
public class Login {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/listar")
	public List<Persona> listar() {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add( new Persona(1, "Raphael", "Roman Guerreros") );
		lista.add( new Persona(2, "Sefany", "Ponche de la cruz") );
		lista.add( new Persona(3, "Jair", "San Roman Moriano") );
		lista.add( new Persona(4, "Joseph", "Ipanaque Huari") );
		lista.add( new Persona(5, "Otro", "XXXXX") );
		
		return lista;
	}
	
	/*
	@GET
	@Produces("application/xml")
	@Path("/login")
	public String requestLogin() {
		StringBuilder sb = new StringBuilder();
		sb.append("<note>");
		sb.append("<to>Guest</to>");
		sb.append("<from>Admin</from>");
		sb.append("<body>Please login</body>");
		sb.append("</note>");
		return sb.toString();
	}
	*/
	
}
