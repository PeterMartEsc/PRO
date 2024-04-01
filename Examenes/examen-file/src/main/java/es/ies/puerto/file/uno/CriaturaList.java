package es.ies.puerto.file.uno;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="criaturas")
public class CriaturaList {
    @ElementList(inline = true)
    private List<Criatura> criaturas;

    public CriaturaList(){

    }

    public CriaturaList(List<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    public List<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(List<Criatura> criaturas) {
        this.criaturas = criaturas;
    }
}
