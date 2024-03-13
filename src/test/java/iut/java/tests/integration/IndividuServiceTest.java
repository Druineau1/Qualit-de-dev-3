package iut.java.tests.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iut.java.dto.IndividuDto;
import iut.java.service.IndividuService;

public class IndividuServiceTest {

private IndividuService service;

	@BeforeEach
	public void before() {
		// Arrange Création d'une instance de IndividuService avec un fichier spécifique
		service = new IndividuService("DruineauThomas.csv");
}
	@Test
	public void testLoadedIndividusName() {
		//Act Appel de la méthode getIndividusList pour charger les individus 
		List<IndividuDto> list = service.getIndividusList();
		//Assert Vérification nom attendu
		assertEquals("Mc Gee",list.get(0).getLastName());
		assertEquals("Josselsohn",list.get(1).getLastName());
		assertEquals("McGirl",list.get(2).getLastName());
		assertEquals("Nealand",list.get(3).getLastName());
		assertEquals("Mitchard",list.get(4).getLastName());
	}
	
	@Test
	public void testCountLoadedIndividus() {


        // Act Appel de la méthode getIndividusList pour charger les individus
        int attendu = 50 ;
        int reel = service.getIndividusList().size();

        // Assert Vérification du nombre d'individus chargés
        

        assertEquals(attendu, reel);

}
}

