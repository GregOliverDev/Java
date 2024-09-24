import java.util.ArrayList;
import java.util.List;

public class MenagerVend {
	public List<Vend> vends = new ArrayList<Vend>();

	public void registrarVenda(Vend vend) {
		vends.add(vend);
	}
	
	public Vend buscarVendaPeloCod(int codAux) {
		Vend vendAux = new Vend();
		for(Vend vend: vends) {
			if(vend.cod == codAux) {
				vendAux = vend;
			}
		}
		return vendAux;
	}
}
