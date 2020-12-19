class Clave{
	private String claves[];
		
		Clave(){
			claves=new String[10];
		}
	public  boolean comprobar(String clave, int intentos){
		StringBuffer invertida = new StringBuffer(clave);
		invertida.reverse();
		
		if(intentos==0)//Primera instancia
			return true;
		else{
			for(int i=0; i<claves.length;i++){
				if(i<intentos)
					if(claves[i].contentEquals(invertida)){
						System.out.println("Clave ingresada");
						return false;
					}
			}//Si llega hasta aqui esque no hubo ninguno igual
			return true;
		} 
	}
	public void asignar(String clave, int pos){
			StringBuffer invertida = new StringBuffer(clave);
		claves[pos] = invertida.reverse().toString();
	}
	public String traerClaves(int pos){
		return claves[pos];
	}
}
class Main {
  public static void main(String[] args) {
		Leer leamos = new Leer();

		Clave cla = new Clave();

		String claves;
		int pos=0,intentos=0;
		do{
			System.out.println("Ingrese su contraseña a validar\nPara terminar ingrese: Fin\t"+ (pos+1));
			claves = leamos.DatosCad();
			if(cla.comprobar(claves,intentos)&&!claves.equalsIgnoreCase("Fin")){
				cla.asignar(claves, pos);
				pos++;
				intentos++;
			}
		}while(!claves.equalsIgnoreCase("Fin")&&pos<10);
		
		if(pos==10)
				System.out.println("Alcanzaste el limite de claves por introducir");

		for(int i=0; i<10;i++)
			if(i<pos)//Para que se imprima solo la cantidad de datos ingresados, sin los que son null
				System.out.println(cla.traerClaves(i));
		
  }
}