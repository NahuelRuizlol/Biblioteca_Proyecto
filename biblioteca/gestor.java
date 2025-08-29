package biblioteca;

public class gestor {

	public static void main(String[] args) {
		vtnInicioSesion vt1 = new vtnInicioSesion();
		vt1.setVisible(true);

	}

	public void mostrarAlta() {

		vtnAlta vtA = new vtnAlta();
		vtA.setVisible(true);
	}

	public void mostrarBaja() {

	}

	public void mostrarEditar() {

		vtnEditar vtE = new vtnEditar();
		vtE.setVisible(true);

	}

	public void mostrarInstrucciones() {

		vtnInstru vtI = new vtnInstru();
		vtI.setVisible(true);
	}
	
	public void mostrarPrestamo() {
		vtnCeibal vtC = new vtnCeibal();
		vtC.setVisible(true);
		
	}
	
	public void mostrarPrestamosEchos() {
		vtnPrestamosEchos vtP = new vtnPrestamosEchos();
		vtP.setVisible(true);
		
	}
	
	public void mostrarOpcionesPrestamos() {
		vtnOpcionesPrestamos vtPre = new vtnOpcionesPrestamos();
		vtPre.setVisible(true);

	}
	
	public void mostrarPrincipal() {
	vtnPrincipal vt1 = new vtnPrincipal();
	vt1.setVisible(true);
	}
}
