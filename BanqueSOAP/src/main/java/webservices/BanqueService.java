package webservices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod()
    public double convertion(@WebParam(name = "montant") double mt){
        return mt*11;
    }
    @WebMethod()
    public Compte getCompte(@WebParam(name = "montant") int compte){
        return new Compte(compte,129,new Date());
    }
    @WebMethod()
    public List<Compte> compteList(){
        List<Compte> list=new ArrayList<Compte>();
        list.add(new Compte (1,400,new Date()));
        list.add(new Compte (2,43300,new Date()));
        list.add(new Compte (3,340,new Date()));
        list.add(new Compte (4,48480,new Date()));
        return list;
    }

}
