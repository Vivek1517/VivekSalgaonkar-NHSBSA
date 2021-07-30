Feature: Cost checker tool

  @WithBenefits
  Scenario Outline: Verify user is able to see what help he gets from NHS when he says he gets benefits
    Given user is on what help you can get to pay page
    When user clicks on the start button
    Then user should navigate to select a country
    When user selects "<country>" and clicks next
    And user enters "<date>", "<month>" and "<year>" and clicks next
    And user chooses do you leave with a patner and "<partner>" and clicks next
    And user chooses do your partner claim any benefits or tax credits and "<benefit>" and click on next
    And user choose do you or your partner get universal credit "<universal credit>" and click on next
    And user chooses as a part of your joint universal credit "<universal option>" and click on next
    And user chooses combined take home pay option as "<take home pay>" and click on next
    Then user should navigate to the result page
    Examples:
      | country | date | month | year | partner | benefit | universal credit | universal option | take home pay |
      | Wales   | 06   | 08    | 1980 | yes     | yes     | yes              | yes              | yes           |

    @NoBenefits
  Scenario Outline: Verify user is able to see what help he gets from NHS when he says he doesnt get benefits
    Given user is on what help you can get to pay page
    When user clicks on the start button
    Then user should navigate to select a country
    When user selects "<country>" and clicks next
    And user enters "<date>", "<month>" and "<year>" and clicks next
    And user chooses do you leave with a patner and "<partner>" and clicks next
    And user chooses do your partner claim any benefits or tax credits and "<benefit>" and click on next
    And user choose are you pregnat or have given birth "<pregnant>" and click on next
    And user chooses have any injuries or ilness by working in arm forces "<injuries>", "<diabetes>" and "<glaucoma>"click on next
    And user chooses does your partner live in a care home "<care home>" and click on next
    And user chooses if they have saving or investements "<investments>" and click on next
    Then user should navigate to the result page
      Examples:
        | country | date | month | year | partner | benefit | pregnant | injuries | diabetes | glaucoma | care home | investements |
        | Wales   | 06   | 08    | 1980 | yes     | no      | no       | no       | no       | no       | no        | no           |

  @CareHomeHelp
  Scenario Outline: Verify user is able to see what help he gets from NHS when he says he doesnt get benefits but help for care home
    Given user is on what help you can get to pay page
    When user clicks on the start button
    Then user should navigate to select a country
    When user selects "<country>" and clicks next
    And user enters "<date>", "<month>" and "<year>" and clicks next
    And user chooses do you leave with a patner and "<partner>" and clicks next
    And user chooses do your partner claim any benefits or tax credits and "<benefit>" and click on next
    And user choose are you pregnat or have given birth "<pregnant>" and click on next
    And user chooses have any injuries or ilness by working in arm forces "<injuries>", "<diabetes>" and "<glaucoma>"click on next
    And user chooses does your partner live in a care home "<care home>" and click on next
    And user chooses do you get help from council for care home "<council help>" and click on next
    And user chooses if they have saving or investements "<investments>" and click on next
    Then user should navigate to the result page
    Examples:
      | country | date | month | year | partner | benefit | pregnant | injuries | diabetes | glaucoma | care home | council help |
      | Wales   | 06   | 08    | 1980 | yes     | no      | yes      | yes      | yes      | yes      | yes       | yes          |

  @Test
  Scenario Outline: Verify user is able to see what help he gets from NHS when he says he gets benefits
    Given user is on what help you can get to pay page
    When user clicks on the start button
    Then user should navigate to select a country
    When user selects "<country>" and clicks next
    And user enters "<date>", "<month>" and "<year>" and clicks next
    And user chooses do you leave with a patner and "<partner>" and clicks next
    And user chooses do your partner claim any benefits or tax credits and "<benefit>"
    Then user should navigate to the result page
    Examples:
      | country | date | month | year | partner | benefit |
      | Wales   | 06   | 08    | 1980 | yes     | no      |
      | Wales   | 06   | 08    | 1980 | yes     | yes     |