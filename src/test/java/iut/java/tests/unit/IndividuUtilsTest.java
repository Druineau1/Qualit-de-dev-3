package iut.java.tests.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

@ParameterizedTest
@CsvSource(value = {"1,Heidie,Mc Gee,hmcgee0@baidu.com,Female,36.178.60.39", "2,Atlante,Josselsohn,ajosselsohn1@about.com,Female,6.197.87.120","3,Brier,McGirl,bmcgirl2@census.gov,Female,157.170.1.173"})
void testGetIndividuParam(int Id, String FirstName, String LastName, String Email, String Gender, String IpAddress){

    // ARRANGE
    String line = Id + "," + FirstName + "," + LastName + "," + Email + "," + Gender + "," + IpAddress;

    // ACT
    IndividuDto individuDto = IndividuUtils.getIndividu(line);

    // ASSERT
    assertEquals(Id, individuDto.getId());
    assertEquals(FirstName, individuDto.getFirstName());
    assertEquals(LastName, individuDto.getLastName());
    assertEquals(Email, individuDto.getEmail());
    assertEquals(Gender, individuDto.getGender());
    assertEquals(IpAddress, individuDto.getIpAddress());

}
}

