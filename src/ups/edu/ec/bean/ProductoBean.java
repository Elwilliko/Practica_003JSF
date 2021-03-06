package ups.edu.ec.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ups.edu.ec.entidad.Bodega;
import ups.edu.ec.entidad.Categoria;

//Activates CDI build-in beans
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named 
@RequestScoped
public class ProductoBean implements Serializable{
        
    private static final long serialVersionUID = 1L;
         
      private String nombre;
      private double precioVenta;
      private double precioCompra;
      private int iva;
      private int stock;
      private List<Categoria> list;
      private List<Bodega> bodegas;
     
      @PostConstruct
      public void init(){
          list=ejbCategoriaFacade.findAll();
          bodegas= ejbBodegaFacade.findAll();
          productos= ejbProductoFacade.findAll();

      }

   
      
}