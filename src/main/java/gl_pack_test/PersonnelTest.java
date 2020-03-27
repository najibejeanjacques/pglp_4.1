package gl_pack_test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import gl_pack.Personnel;
import gl_pack.Personnel.PersonnelBuilder;

public class PersonnelTest {
	
	@Test
	public  void TestPersonnelBuilder() {	
		Personnel emp = new Personnel.PersonnelBuilder("OUEDRAOGO","Najibe")
				.build();
		//assertEquals("le nom doit être egal à: OUEDRAOGO", "OUEDRAOGO", emp.getNom());
		assertEquals("OUEDRAOGO", emp.getNom());
	}

	@Test
	public  void TestPersonnelBuilderNom() {	
		Personnel emp = new Personnel.PersonnelBuilder("OUEDRAOGO","Najibe")
				.build();
		//assertEquals("le nom doit être egal à: OUEDRAOGO", "OUEDRAOGO", emp.getNom());
		assertEquals("OUEDRAOGO", emp.getNom());
	}
}
