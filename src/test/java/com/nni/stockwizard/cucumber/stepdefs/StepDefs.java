package com.nni.stockwizard.cucumber.stepdefs;

import com.nni.stockwizard.StockwizardApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = StockwizardApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
