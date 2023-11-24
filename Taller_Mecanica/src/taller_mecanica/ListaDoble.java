package taller_mecanica;


public class ListaDoble {
    Nodo pri, ult , PriRep;

    public ListaDoble() {
        pri = null;
        PriRep = null;
        ult = null;
      
    }

    public boolean esVacia() {
        if (pri == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(Nodo nue) {
       
        if (esVacia()) {
            pri = nue;
           
            ult = nue;
        } else {
            Nodo aux = pri;
            while (aux != null && nue.cedula > aux.cedula) {
                aux = aux.sig;
            }
            if (aux == pri ) {
                nue.sig = pri;
                pri.ant = nue;
                pri = nue;
            } else {
                if (aux == null) {
                    nue.ant = ult;
                    ult.sig = nue;
                    ult = nue;
                } else {
                    nue.sig = aux;
                    nue.ant = aux.ant;
                    aux.ant.sig = nue;
                    aux.ant = nue;
                }
            }
        }
    }

    public boolean eliminar(int v) {
        Nodo aux = pri;
        while (aux != null && aux.cedula != v) {
            aux = aux.sig;
        }
        if (aux == null) {
            return false;
        } else {
            if (aux == pri && aux == ult) {
                pri = null;
                ult = null;
            } else if (aux == pri) {
                pri = pri.sig;
                pri.ant = null;
                aux.sig = null;
            } else if (aux == ult) {
                ult = ult.ant;
                aux.ant = null;
                ult.sig = null;
            } else {
                aux.ant.sig = aux.sig;
                aux.sig.ant = aux.ant;
                aux.sig = null;
                aux.ant = null;
            }

        }

        return true;
    }

  public boolean insertarDeuda(int xid, NodoRep nue){
       
        Nodo aux = pri;
        while (aux!=null && aux.cedula!=xid){
            aux=aux.sig;
        }
        if (aux==null) return false;
        else{
            NodoRep aux1 = aux.priRep;
            if (aux1==null) aux.priRep=nue;
            else{
                while(aux1.sigREP!=null) aux1=aux1.sigREP;
                aux1.sigREP=nue;
            }
            
        }
        return true;
    }

    

}
