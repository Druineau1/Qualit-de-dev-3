package iut.java.tests.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import iut.java.dto.IndividuDto;
import iut.java.utils.IndividuUtils;

public class IndividuUtilsTest {
	
@Test
void testGetIndividu() {
	//Initialiation de la ligne de test
	String line = "1,Heidie,Mc Gee,hmcgee0@baidu.com,Female,36.178.60.39";
	//Déclaration d'un individu de type IndividuDto
	IndividuDto individu = IndividuUtils.getIndividu(line);
	//Test des valeurs 
	assertEquals(1,individu.getId());
	assertEquals("Heidie",individu.getFirstName());
	assertEquals("Mc Gee",individu.getLastName());
	assertEquals("hmcgee0@baidu.com",individu.getEmail());
	assertEquals("Female",individu.getGender());
	assertEquals("36.178.60.39",individu.getIpAddress());
}

@Test 
void testGetLine() {
    // Création d'un IndivduDto
    IndividuDto dto = new IndividuDto();
    dto.setId((long) 1);
    dto.setFirstName("Heidie");
    dto.setLastName("Mc Gee");
    dto.setEmail("hmcgee0@baidu.com");
    dto.setGender("Female");
    dto.setIpAddress("36.178.60.39");

    // Appel de la méthode à tester
    String expectedLine = "1,Heidie,Mc Gee,hmcgee0@baidu.com,Female,36.178.60.39";
    String actualLine = IndividuUtils.getLine(dto);

    // Test du résultat
    assertEquals(expectedLine, actualLine);
}
}
