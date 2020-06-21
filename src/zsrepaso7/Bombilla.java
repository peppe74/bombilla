/*
Ejercicio n 10 (Propiedad est�tica)
Queremos modelar una casa con muchas bombillas, de forma que cada bombilla se puede encender o
apagar individualmente. Para ello haremos una clase Bombilla con una variable privada que almacene si
est� encendida o apagada, as� como un m�todo que nos diga si una bombilla concreta est� encendida.
Adem�s queremos poner un interruptor general de la luz, tal que si saltan los fusibles, todas las bombillas
quedan apagadas. Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas, seg�n
estuvieran antes del percance
 */
package zsrepaso7;

public class Bombilla {
    
    private boolean estado;

    public Bombilla(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String EncApa(){ //Creo este metodo que imprime el estado booleano en el return
        if (estado==false){ //Aqui fue fundamental == haste que no lo puse asi no me funciono "que paranoia"
            return "Esta apagada";
        }else{
            return "Esta encendida";
        }
       }
    }
        
    
   