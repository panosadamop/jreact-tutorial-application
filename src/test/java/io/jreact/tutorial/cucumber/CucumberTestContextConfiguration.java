package io.jreact.tutorial.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.jreact.tutorial.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
