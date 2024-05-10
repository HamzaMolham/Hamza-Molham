Feature: Login Page
  Background:
    Given User open the website

  Scenario Outline: Login with valid email and password
    When user signing with "<Username>" and "<Password>"
    Then user will be directed to homepage
    Examples:
      |        Username        |   Password |
      |   standard_user        | secret_sauce |

    Scenario Outline: Login with lockedout user
      When user signing with "<Username>" and "<Password>"
      Then the user will get an error massage
      Examples:
      |Username|Password|
      |    locked_out_user    |    secret_sauce    |

  Scenario Outline: Login with Problem user
    When user signing with "<Username>" and "<Password>"
    Then user will see wrong image displayed in homepage
    Examples:
      |Username|Password|
      |    problem_user    |    secret_sauce    |


  Scenario Outline: Login with Problem user
    When user signing with "<Username>" and "<Password>"
    Then user will wait too long for the homepage to be displayed
    Examples:
      |Username|Password|
      |    performance_glitch_user    |    secret_sauce    |


  Scenario Outline: Login with Error user
    When user signing with "<Username>" and "<Password>"
    And user click on sorting button
    Then An alert will pop up to the user
    Examples:
      |Username|Password|
      |    error_user    |    secret_sauce    |

  Scenario Outline: Login with Visual user
    When user signing with "<Username>" and "<Password>"
    Then user will find basket button is misplaced.
    Examples:
      |Username|Password|
      |    visual_user    |    secret_sauce    |

