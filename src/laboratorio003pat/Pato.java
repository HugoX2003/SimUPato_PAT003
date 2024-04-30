
package laboratorio003pat;

public class Pato {

    public static void main(String[] args) {
        PatoReal pr=new PatoReal ();
    pr.mostrar();
    pr.cuaquear();
    pr.volar();
    pr.nadar();
    
    PatoDeGoma pg=new PatoDeGoma ();
    pg.mostrar();
    pg.cuaquear();
    pg.noVolar();
    pg.nadar();
    
    PatoSenuelo ps=new PatoSenuelo ();
    ps.mostrar();
    ps.noCuaquear();
    ps.noVolar();
    ps.nadar();
    
    PatoCabezaRoja pcr=new PatoCabezaRoja ();
    pcr.mostrar();
    pcr.cuaquear();
    pcr.volar();
    pcr.nadar();
    }
    
}
