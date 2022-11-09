Feature: Calculate BMI

  @Regression
  Scenario Outline: Calculate BMI1
    Given Calculator Website is launched1
    When BMI Calculator link is displayed1
    Then Click and verify Page title1
    When BMI Calculator is displayed1
    Then Fill <age> , <height> and <weight> and calculate BMI1
    When Result is displayed1
    Then Capture result and close browser1

    Examples:
      | age | height | weight |
      | 10  | 127    | 40     |
      | 30  | 156    | 70     |
      | 25  | 152    | 55     |
      | 20  | 160    | 45     |
      | 35  | 160    | 70     |

  @Regression
  Scenario Outline: Calculate BMI2
    Given Calculator Website is launched2
    When BMI Calculator link is displayed2
    Then Click and verify Page title2
    When BMI Calculator is displayed2
    Then Fill <age> , <height> and <weight> and calculate BMI2
    When Result is displayed2
    Then Capture result and close browser2

    Examples:
      | age | height | weight |
      | 20  | 127    | 40     |
      | 35  | 156    | 70     |
      | 40  | 167    | 89     |
      | 43  | 143    | 76     |
      | 21  | 178    | 87     |

  @Regression
  Scenario Outline: Calculate BMI3
    Given Calculator Website is launched3
    When BMI Calculator link is displayed3
    Then Click and verify Page title3
    When BMI Calculator is displayed3
    Then Fill <age> , <height> and <weight> and calculate BMI3
    When Result is displayed3
    Then Capture result and close browser3

    Examples:
      | age | height | weight |
      | 10  | 160    | 45     |
      | 30  | 160    | 70     |
      | 43  | 176    | 69     |
      | 21  | 179    | 78     |
      | 31  | 169    | 85     |

  @Regression
  Scenario Outline: Calculate BMI4
    Given Calculator Website is launched4
    When BMI Calculator link is displayed4
    Then Click and verify Page title4
    When BMI Calculator is displayed4
    Then Fill <age> , <height> and <weight> and calculate BMI4
    When Result is displayed4
    Then Capture result and close browser4

    Examples:
      | age | height | weight |
      | 30  | 160    | 70     |
      | 25  | 127    | 55     |
      | 14  | 152    | 54     |
      | 18  | 145    | 65     |
      | 32  | 178    | 82     |

  @Regression
  Scenario Outline: Calculate BMI5
    Given Calculator Website is launched5
    When BMI Calculator link is displayed5
    Then Click and verify Page title5
    When BMI Calculator is displayed5
    Then Fill <age> , <height> and <weight> and calculate BMI5
    When Result is displayed5
    Then Capture result and close browser5

    Examples:
      | age | height | weight |
      | 30  | 127    | 45     |
      | 35  | 160    | 40     |
      | 21  | 154    | 72     |
      | 17  | 176    | 68     |
      | 8   | 132    | 45     |

