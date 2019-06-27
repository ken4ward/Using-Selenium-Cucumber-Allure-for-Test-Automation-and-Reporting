package com.fblogin.stepsdefinition;

import com.fblogin.tests.init.Init;
import com.fblogin.tests.testcases.TestCases;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpringboardStepDefinition {

    @Given("^I am on the Springboard Github page on URL$")
    public void i_am_on_the_Springboard_Github_page_on_URL() throws Throwable {
        Init.initProperties();
    }

    @Then("^I should see Springboard Github$")
    public void i_should_see_Springboard_Github() throws Throwable {
        TestCases.validateFbPage();
    }

    @When("^I navigate to https://springboardretail\\.github\\.io/qa-recruiting/$")
    public void i_navigate_to_https_springboardretail_github_io_qa_recruiting() throws Throwable {
        Init.initProperties();
    }

    @When("^I fill in firstname$")
    public void i_fill_in_firstname() throws Throwable {
        TestCases.firstname();
    }

    @When("^I fill in lastname$")
    public void i_fill_in_lastname() throws Throwable {
        TestCases.lastname();
    }

    @When("^I select  the country$")
    public void i_select_the_country() throws Throwable {
        TestCases.country();
    }

    @When("^I fill in the message$")
    public void i_fill_in_the_message() throws Throwable {
        TestCases.message();
    }

    @When("^I click the submit button$")
    public void i_click_the_submit_button() throws Throwable {
        TestCases.submitButton();
    }

    @Then("^It should display the filled in details$")
    public void it_should_display_the_filled_in_details() throws Throwable {
        TestCases.pageValidate();
    }

}
