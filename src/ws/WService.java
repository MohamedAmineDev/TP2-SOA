package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Etudiant;
@WebService(name="Verification")
public class WService {
	@WebMethod(operationName="VerifEtudiant")
public String verificationEtudiant(@WebParam(name="cin")int cin) {
	EntityManager em;
	EntityManagerFactory emf;
	emf=Persistence.createEntityManagerFactory("Exp");
	em=emf.createEntityManager();
	try {
		
		em.getTransaction().begin();
		Query query=em.createNamedQuery("Etudiant.findOne");
		query.setParameter("cin",cin);
		Etudiant etudiant=(Etudiant)query.getSingleResult();
		return " Etudiant Trouvé";
	}
	catch(Exception e) {
		return "Etudiant n'est pas Trouvé";
	}
	
	
}
}
