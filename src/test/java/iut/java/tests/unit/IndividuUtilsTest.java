package iut.java.tests.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import iut.java.dto.IndividuDto;
import iut.java.utils.IndividuUtils;

public class IndividuUtilsTest {
	
@Test
void testGetIndividu() {
	//ARRANGE Initialiation de la ligne test
	String line = "1,Heidie,Mc Gee,hmcgee0@baidu.com,Female,36.178.60.39";
	//ACT déclaration d'un individu de type IndividuDto
	IndividuDto individu = IndividuUtils.getIndividu(line);
	//ASSERT Test des valeurs 
	assertEquals(1,individu.getId());
	assertEquals("Heidie",individu.getFirstName());
	assertEquals("Mc Gee",individu.getLastName());
	assertEquals("hmcgee0@baidu.com",individu.getEmail());
	assertEquals("Female",individu.getGender());
	assertEquals("36.178.60.39",individu.getIpAddress());
}

}
