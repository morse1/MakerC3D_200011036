package makerc3d_200011036;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
        
}
