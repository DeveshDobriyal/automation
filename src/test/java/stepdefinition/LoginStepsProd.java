package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class LoginStepsProd {
	@And("Validates the home screen")
	public void validates_the_home_screen() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@And("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
		/*
		 * List<List<String>> data = dataTable.asLists();
		 * System.out.println(data.get(0).get(0));
		 */
		List<Map<String, String>> map = dataTable.asMaps();
		System.out.println(map.get(0).get("Name")+"first name last ame are "+map.get(0).get("LName"));
		for (Map<String,String> data: dataTable.asMaps(String.class,String.class))
		{
			System.out.println(data.get("Name")+"First name and last name are "+data.get("LName"));
		}
	}

}
