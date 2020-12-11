Feature: FAQ

  Scenario Outline: User can find an answer to a frequently asked question
    Given Open faq page
    When Select "<section>" section on the left panel
    And Click on "<question>" question
    Then Show answer "<answer>" under question "<question>"

    Examples:
    | section               | question                | answer                                                    |
    | Обучение              | Как проходят занятия?   | Занятия всегда проходят в формате интерактивных вебинаров, как правило, 2 раза в неделю по 1,5 часа, по вечерам. Одно занятие в неделю посвящено новому материалу и одно обсуждению и разбору практических работ, корректировки могут быть внесены преподавателем, в зависимости от курса.Ссылка на вебинар появляется в вашем личном кабинете за 15 минут до начала трансляции.                                                     |