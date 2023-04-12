package com.example.steps;

import com.example.state.ScenarioState;
import io.cucumber.java.en.When;

/**
 * State modifying steps. They act on the currently active example/scenario state which is inject into an instance of
 * this class per example/scenario.
 */
public class ExecutionSteps {

  private final ScenarioState state;

  public ExecutionSteps(final ScenarioState state) {
    this.state = state;
  }

  @When("something is executed")
  public void execute() {
    final String userInput = state.getUserInput();
    final int result = Integer.parseInt(userInput);
    state.setResult(result);
  }

}
