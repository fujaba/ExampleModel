package de.uniks.example;

import org.junit.Test;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Feature;

public class ExampleModelGen {

	@Test
	public void testExampleModel(){
		ClassModel model = new ClassModel("de.uniks.example");
		Clazz student = model.createClazz("Student");
		Clazz uni = model.createClazz("Uni");
		
		model.withoutFeature(Feature.PatternObject);
		model.generate("src/main/java");
	}
}
