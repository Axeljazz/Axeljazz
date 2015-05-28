import javax.swing.JOptionPane;

public class start {
	public static void main(String[] args) {

		boolean go = true;

		while (go) {

			try{
				
				int option = Integer.parseInt(JOptionPane.showInputDialog(
						"Selecciona una carta: \n" + "Carta 1 \n " + "Carta 2 \n "
								+ "Carta 3 \n" + "Selecciona Cancelar u opción 4 para salir"));
				
				switch (option) {
				case 1:
				case 2:
				case 3:
					JOptionPane.showMessageDialog(null, "Ganaste un carro");
					break;
				case 4:
					go = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Respuesta no válida");
					break;
				}
				
			}catch(Exception e){
				System.exit(0);
			}

		}
	}
}