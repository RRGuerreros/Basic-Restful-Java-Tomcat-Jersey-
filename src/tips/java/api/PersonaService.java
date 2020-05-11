package tips.java.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/persona")
public class PersonaService {

	
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
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Path("/registrar")
	public Response registrar( Persona persona ){
		
		List<Persona> lista = new ArrayList<Persona>();
				
		lista.add(persona);	
		
		String nombre_completo = persona.getNombre() + ", " + persona.getApellidos();
		
		return Response.ok("Se registró correctamente la persona : " + nombre_completo ).build();
	}
	
	@GET
	@Path("/buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Persona buscar( @PathParam("id") int id ) {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add( new Persona(1, "Raphael", "Roman Guerreros") );
		lista.add( new Persona(2, "Sefany", "Ponche de la cruz") );
		lista.add( new Persona(3, "Jair", "San Roman Moriano") );
		lista.add( new Persona(4, "Joseph", "Ipanaque Huari") );
		
		Persona personaResponse = null;
		
		for (Persona persona : lista) {
			if( persona.getId() == id ) {
				personaResponse = persona;
				break;
			}
		}
		
		return personaResponse;
	}
	
	@GET
	@Path("/editar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<Persona> editar( Persona persona ) {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add( new Persona(1, "Raphael", "Roman Guerreros") );
		lista.add( new Persona(2, "Sefany", "Ponche de la cruz") );
		lista.add( new Persona(3, "Jair", "San Roman Moriano") );
		lista.add( new Persona(4, "Joseph", "Ipanaque Huari") );
		
		for (Persona p : lista) {
			if( p.getId() == persona.getId() ) {
				p.setNombre( persona.getNombre() );
				p.setApellidos( persona.getApellidos() );
				break;
			}
		}
		
		return lista;
	}
	
	@DELETE
	@Path("/eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Persona> editar( @PathParam("id") int id ) {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add( new Persona(1, "Raphael", "Roman Guerreros") );
		lista.add( new Persona(2, "Sefany", "Ponche de la cruz") );
		lista.add( new Persona(3, "Jair", "San Roman Moriano") );
		lista.add( new Persona(4, "Joseph", "Ipanaque Huari") );
				
		for (int i = 0; i < lista.size(); i++) {
			if( lista.get(i).getId() == id ) {
				lista.remove( i );
				break;
			}			
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
