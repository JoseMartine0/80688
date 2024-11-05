package mx.uv.practica11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Practica11Application {

	Color color = new Color();

	public static void main(String[] args) {
		SpringApplication.run(Practica11Application.class, args);
	}

	//API relacionada a los colores


	//curl -X PUT -d @color.json -H "Content-Type: application/json" http://localhost:8080/modificarColor
@RequestMapping(method = RequestMethod.PUT, value = "/modificarColor")
	String cambiarColor(@RequestBody Color objeto){
		System.out.println(objeto);
		color = objeto;
		return "Color cambiado";
	}
@RequestMapping(method = RequestMethod.DELETE, value = "/eliminarColor/{id}")
	Color eliminarColor(@PathVariable String id){
		System.out.println(id);
		color = null;
		return color;
	}
@RequestMapping(method = RequestMethod.GET, value = "/listarColor")
	Color listarColores(){
		return color;
	}
@RequestMapping(method = RequestMethod.POST, value = "/crearColor")	
	String crearColor(){
		color.setId("1");
		color.setNombre("Blanco");
		color.setValorColor("255");
		System.out.println(color.getNombre());
		return "Color creado";
	}

}
