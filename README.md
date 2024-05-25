# Taller01-Ramas

### Lider - Randy Rivera
Captura: 

![Captura titulo](blob/cambioTitulo.png)

Se cambio el titulo a "Grupo 2 Top 10 Canciones"

En `primary.fxml, linea 40`

`<Label text="Grupo 2 Top 10 Canciones" BorderPane.alignment="CENTER">`

### Integrante 2 - Juan Fernandez
Se cambió el orden de las 10 canciones principales en forma descendiente, usando estos comandos:

En `PrimaryController.java, linea 34:`

`Collections.sort(listaCanciones, Collections.reverseOrder());`

Captura:

![Pantalla con modificaciones hechas](blob/Estudiante2.jpg)


### Integrante 3 - Andrés Salazar
Se colocó el nombre del artista o grupo antes del nombre de la canción.

En `PrimaryController.java, linea 48:`

`Label lbT = new Label(c.getCantante() + " \n" + c.getTitulo() );//cantante y titulo`

Captura:

![Captura estudiante 3](blob/Estudiante3.jpg)


### Integrante 4 - Dhamar Quishpe 

Se cambió los números tradicionales por números romanos y se añadió color. 
En `PrimaryController.java, linea 38, 59-93 y 157`

`Label lbp = new Label(aRomano(c.getPosActual()) + "");`

```
public String aRomano(int num){
        if (num==1){
            return "I";
        }
        if (num==2){
            return "II";
        }
        if (num==3){
            return "III";
        }
        if (num==4){
            return "IV";
        }
        if (num==5){
            return "V";
        }
        if (num==6){
            return "VI";
        }
        if (num==7){
            return "VII";
        }
        if (num==8){
            return "VIII";
        }
        if(num==9){
            return "IX";
        }
        if (num==10){
            return "X";
        }
        else{
            return "No se pudo convertir a número romano";
        }
    }
    
```




`Label lbP = new Label(aRomano(p) + "");`


Captura de pantalla: 

![Captura estudiante 4](blob/Estudiante4.png) 







