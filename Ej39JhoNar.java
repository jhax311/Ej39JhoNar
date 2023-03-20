import java.util.*;
public class  Ej39JhoNar {
	//array en modo estatico global
		public static int arr [] =new int[0];
	//modificar
	private static int[] modificarPila(int[] array, int num){ 

			array=Arrays.copyOf(array,(array.length+num));


		return array;
    }	
	//apilar numero que se ingrese
	public static int[] apilar (int x){
		arr=modificarPila(arr,1);
		arr[arr.length-1]=x;
		//System.out.println("");
		return arr;	
	}	
	//desapila numero --> borra la ultima posicion
	public static int[] desapilar (){
		arr=Arrays.copyOf(arr,arr.length-1);
		return arr;	
	}
	//muestra el array
	public static void mostrar(){
		for(int elemento: arr){
		System.out.println(elemento);
		}		
	}
	//mostrar inverso
	public static void inverso(){
		for(int i =(arr.length-1);i>=0;i--){
		System.out.println(arr[i]);
		}		
	}	
	//borrar pila
	public static int[] borrarPila(){	
		arr=Arrays.copyOf(arr,0);
		return arr;
	}

	public static void main (String[] args) {
		boolean salir= false;
		Scanner sc=new Scanner (System.in);
		 byte opc =0;
		 int num=0;
			do
			{	
				//menu
				System.out.println("---------------MENÚ----------------------");
				System.out.println("\t\t1\tApilar");
				System.out.println("\t\t2\tDesapilar");
				System.out.println("\t\t3\tBorrar pila");
				System.out.println("\t\t4\tMostrar pila");
				System.out.println("\t\t5\tMostrar pilar en orden inverso");
				System.out.println("\t\t6\tSalir");
				System.out.println("-----------------------------------------");
				System.out.print("ELIGE UNA OPCIÓN: ");
				try {
					opc = sc.nextByte();
				} catch(InputMismatchException ime) {
					System.out.println("No se ha introducido un número");
					sc.nextLine();
				} catch (Exception e) {
					System.out.println("Error fatal");
				}
				switch (opc)
				{
					case 1:
						 //Apilar
						System.out.print("Introduce el número que deseas apilar: ");						 
						try {
							num = sc.nextInt();
						} catch(InputMismatchException ime) {
							System.out.println("No se ha introducido un número");
							sc.nextLine();
						} catch (Exception e) {
							System.out.println("Error fatal");
						}
						apilar(num);

						break;
					case 2:
						 //Desapilar
						 if (arr.length >0){
							desapilar();
						 }else{
						 System.out.println("La pila esta vacía");
						 System.out.println(" ");
						 }
						 
						break;
					case 3:
						 //borrar pila
						 if (arr.length >0){
							borrarPila();
						 }else{
						 System.out.println("La pila esta vacía");
						 System.out.println(" ");
						 }
						break;	
					case 4:
						 //mostrar pila
						 if (arr.length >0){
							mostrar();
						 }else{
						 System.out.println("La pila esta vacía");
						 System.out.println(" ");
						 }
						break;	
					case 5:
						 //mostrar inverso
						 if (arr.length >0){
							inverso();
						 }else{
						 System.out.println("La pila esta vacía");
						 System.out.println(" ");
						 }					 
						break;																
					case 6:
						 //Salida
						 salir=true;
						break;
						
					default:
						System.out.println("Introduce una opción correcta: ");
						//ingrese una opcion correcta
				}
				
			} while (!salir);
			

		}
}

