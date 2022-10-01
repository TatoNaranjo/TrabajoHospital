
package hospital;
import java.util.ArrayList;
public class ListaClientes {

   Medico Jose = new Medico("29880","Jose","Feliciano","Masculino");
   Medico Sofia = new Medico("98070","Sofia","Castaño","Femenino"); 
   Medico Carla = new Medico("29881","Carla" , "Padiol", "Femenino");
   Medico Lorenzo = new Medico("92609","Lorenzo", "Herrera", "Masculino");
 
   public String listaSanRafael(){
       String lista = "";
   ArrayList<String> nombre = new ArrayList<String>();
   ArrayList<String> apellido = new ArrayList<String>();
   ArrayList<String> sexo = new ArrayList<String>();
   ArrayList<String> direccion = new ArrayList<String>();
   ArrayList<String> razon = new ArrayList<String>();
   ArrayList<String> medicoAtendiendo = new ArrayList<String>();
   ArrayList<String> fechaAtencion = new ArrayList<String>();
    Cliente Juan_Perez = new Cliente("Juan","Perez","Masculino","Calle Oxford","Hospital San Rafael","Quimioterapia","Carla Padiol","2 de Abril");
    
    nombre.add(Juan_Perez.getNombre()); apellido.add(Juan_Perez.getApellido()); sexo.add(Juan_Perez.getSexo()); direccion.add(Juan_Perez.getDirResidencia()); 
    razon.add(Juan_Perez.getMotivoConsulta()); medicoAtendiendo.add(Juan_Perez.getMedicoAtendiendo()); fechaAtencion.add(Juan_Perez.getFecha()); 
    
    Cliente Santiago_Poveda = new Cliente("Santiago", "Poveda","Masculino","Kennedy","Hospital San Rafael","Dolor de Cabeza Intenso","Sofia Castaño","4 de Febrero");
    
    nombre.add(Santiago_Poveda.getNombre()); apellido.add(Santiago_Poveda.getApellido()); sexo.add(Santiago_Poveda.getSexo()); direccion.add(Santiago_Poveda.getDirResidencia()); 
    razon.add(Santiago_Poveda.getMotivoConsulta()); medicoAtendiendo.add(Santiago_Poveda.getMedicoAtendiendo()); fechaAtencion.add(Santiago_Poveda.getFecha()); 
    
     Cliente Fernando_Zapata = new Cliente("Fernando", "Zapata", "Masculino","El Santuario", "Hospital San Rafael","Fractura de brazo", "Lorenzo Herrera", "29 de Noviembre");
     
     nombre.add(Fernando_Zapata.getNombre()); apellido.add(Fernando_Zapata.getApellido()); sexo.add(Fernando_Zapata.getSexo()); direccion.add(Fernando_Zapata.getDirResidencia()); 
    razon.add(Fernando_Zapata.getMotivoConsulta()); medicoAtendiendo.add(Fernando_Zapata.getMedicoAtendiendo()); fechaAtencion.add(Fernando_Zapata.getFecha()); 
    
    Cliente Elvira_Salgado = new Cliente("Elvira","Salgado", "Femenino", "Calle de los Abogados", "Hospital San Rafael","Dolor en el Pecho","Carla Padiol", "30 de Abril");
    
    nombre.add(Elvira_Salgado.getNombre()); apellido.add(Elvira_Salgado.getApellido()); sexo.add(Elvira_Salgado.getSexo()); direccion.add(Elvira_Salgado.getDirResidencia()); 
    razon.add(Elvira_Salgado.getMotivoConsulta()); medicoAtendiendo.add(Elvira_Salgado.getMedicoAtendiendo()); fechaAtencion.add(Elvira_Salgado.getFecha()); 
    
  Cliente Maria_Batista = new Cliente("Maria", "Batista", "Femenino", "Barrio Norte", "Hospital San Rafael", "Examen de VIH", "Carla Padiol","21 de Enero");
  
  nombre.add(Maria_Batista.getNombre()); apellido.add(Maria_Batista.getApellido()); sexo.add(Maria_Batista.getSexo()); direccion.add(Maria_Batista.getDirResidencia()); 
    razon.add(Maria_Batista.getMotivoConsulta()); medicoAtendiendo.add(Maria_Batista.getMedicoAtendiendo()); fechaAtencion.add(Maria_Batista.getFecha()); 

     for (int i = 0; i < nombre.size(); i++) {
          lista = lista +("----------//----------");
          lista = lista + "<br>";
               int enumerador = i+1;
          lista = lista + enumerador+". "+ "Nombre del Cliente: " + nombre.get(i)+"<br>" + 
                          "Apellido del Cliente: "+apellido.get(i)+"<br>"+
                          "Sexo: "+sexo.get(i)+ "<br>"+
                          "Dirección de Residencia: " + direccion.get(i)+"<br>"+
                          "Hospital En Que Fue Atendido: Hospital San Rafael <br>"+
                          "Causa: "+ razon.get(i)+"<br>"+
                          "Medico Que lo Atiende: "+ medicoAtendiendo.get(i)+"<br>"+
                          "Fecha: "+ fechaAtencion.get(i) + "<br>";
          lista = lista +("----------//----------");
          lista = lista +("<br>");
       }
       
    return lista;
   }
   
   public String listaSantaMaria(){
       String lista = "";
   ArrayList<String> nombre = new ArrayList<String>();
   ArrayList<String> apellido = new ArrayList<String>();
   ArrayList<String> sexo = new ArrayList<String>();
   ArrayList<String> direccion = new ArrayList<String>();
   ArrayList<String> razon = new ArrayList<String>();
   ArrayList<String> medicoAtendiendo = new ArrayList<String>();
   ArrayList<String> fechaAtencion = new ArrayList<String>();
   
     Cliente Emiliano_Ramirez = new Cliente("Emiliano","Ramirez","Masculino","Calle 80","Clinica Santa Maria","Resonancia de Cuerpo completo","Jose Feliciano","6 de Octubre");
    
    nombre.add(Emiliano_Ramirez.getNombre()); apellido.add(Emiliano_Ramirez.getApellido()); sexo.add(Emiliano_Ramirez.getSexo()); direccion.add(Emiliano_Ramirez.getDirResidencia()); 
    razon.add(Emiliano_Ramirez.getMotivoConsulta()); medicoAtendiendo.add(Emiliano_Ramirez.getMedicoAtendiendo()); fechaAtencion.add(Emiliano_Ramirez.getFecha()); 
    
    Cliente Lucy_Araujo = new Cliente("Lucy", "Araujo", "Femenino", "Barrios Unidos", "Clinica Santa Maria", "Cirrosis Quistica", "Jose Feliciano","16 de Junio");
    
    nombre.add(Lucy_Araujo.getNombre()); apellido.add(Lucy_Araujo.getApellido()); sexo.add(Lucy_Araujo.getSexo()); direccion.add(Lucy_Araujo.getDirResidencia()); 
    razon.add(Lucy_Araujo.getMotivoConsulta()); medicoAtendiendo.add(Lucy_Araujo.getMedicoAtendiendo()); fechaAtencion.add(Lucy_Araujo.getFecha()); 
    
     Cliente Erick_Ramirez = new Cliente("Erick", "Ramirez", "Masculino", "Bosa", "Clinica Santa Maria", "Control de Ansiedad", "Lorenzo Herrera", "4 de Julio");
     
     nombre.add(Erick_Ramirez.getNombre()); apellido.add(Erick_Ramirez.getApellido()); sexo.add(Erick_Ramirez.getSexo()); direccion.add(Erick_Ramirez.getDirResidencia()); 
    razon.add(Erick_Ramirez.getMotivoConsulta()); medicoAtendiendo.add(Erick_Ramirez.getMedicoAtendiendo()); fechaAtencion.add(Erick_Ramirez.getFecha()); 
    
    Cliente Juliana_Acevedo = new Cliente("Juliana","Acevedo", "Femenino", "Barrio Bochica", "Clinica Santa Maria", "Infarto Repentino", "Lorenzo Herrera", "12 de Diciembre");
    
    nombre.add(Juliana_Acevedo.getNombre()); apellido.add(Juliana_Acevedo.getApellido()); sexo.add(Juliana_Acevedo.getSexo()); direccion.add(Juliana_Acevedo.getDirResidencia()); 
    razon.add(Juliana_Acevedo.getMotivoConsulta()); medicoAtendiendo.add(Juliana_Acevedo.getMedicoAtendiendo()); fechaAtencion.add(Juliana_Acevedo.getFecha()); 
    
  Cliente Mariana_Rivas = new Cliente("Mariana","Rivas", "Femenino", "Calle 80", "Clinica Santa Maria", "Prueba PCR", "Jose Feliciano", "19 de Agosto");
  
  nombre.add(Mariana_Rivas.getNombre()); apellido.add(Mariana_Rivas.getApellido()); sexo.add(Mariana_Rivas.getSexo()); direccion.add(Mariana_Rivas.getDirResidencia()); 
    razon.add(Mariana_Rivas.getMotivoConsulta()); medicoAtendiendo.add(Mariana_Rivas.getMedicoAtendiendo()); fechaAtencion.add(Mariana_Rivas.getFecha()); 

      for (int i = 0; i < nombre.size(); i++) {
          lista = lista +("----------//----------");
          lista = lista + "<br>";
               int enumerador = i+1;
          lista = lista + enumerador+". "+ "Nombre del Cliente: " + nombre.get(i)+"<br>" + 
                          "Apellido del Cliente: "+apellido.get(i)+"<br>"+
                          "Sexo: "+sexo.get(i)+ "<br>"+
                          "Dirección de Residencia: " + direccion.get(i)+"<br>"+
                          "Hospital En Que Fue Atendido: Hospital San Rafael <br>"+
                          "Causa: "+ razon.get(i)+"<br>"+
                          "Medico Que lo Atiende: "+ medicoAtendiendo.get(i)+"<br>"+
                          "Fecha: "+ fechaAtencion.get(i) + "<br>";
          lista = lista +("----------//----------");
          lista = lista +("<br>");
       }
   
    return lista;
   }
}

