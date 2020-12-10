Feature: Categories menu

  Scenario Outline: Available list of categories
    Given Open main page
    Then Show category "<category>" in header menu
    And Category "<category>" has "<link>" link

    Examples:
    | category                    | link                                             |
    | Программирование            | https://otus.ru/categories/programming/          |
    | Инфраструктура              | https://otus.ru/categories/operations/           |
    | Информационная безопасность | https://otus.ru/categories/information-security/ |
    | Data Science                | https://otus.ru/categories/data-science/         |
    | Управление                  | https://otus.ru/categories/marketing-business/   |
    | Тестирование                | https://otus.ru/categories/testing/              |