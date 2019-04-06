package examen_1;

public class classTransmisionBiplato  implements Transmision{//Programar hacia interfaces
	private static final String TRANSMISION = "Transmision Biplato";
	@Override
	public void soyTipo() {

		System.out.println(TRANSMISION);
	}

}
