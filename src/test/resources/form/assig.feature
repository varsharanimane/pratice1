
#Sample Feature Definition Template
@tag
Feature: Data driven testing for gov website
   @tag2
  Scenario Outline: Title of your scenario outline
    Given User is open the chrome browser and navigate to gov website
    When  User is entering account information "<Username>","<E-mail address>"
    And   User is entering personal information "<First Name>","<Last Name>","<Country>","<State>",
    And   User is enter "<PIN_Code>", "<Education>","<text>"
    And   User click on check box and User click on create new account
    Then  error notification is displyed

    Examples: 
      |Username    | E-mail address | First Name |Last Name|Country   |State   |PIN_Code|Education                           |text  |
      |arohi       | aro@gmail.com  | Arohi      |thorat   |India     |Goa     |416405  |Elementary Education                |Hii   |
      |aks>hata    |aksh@gmail.com  | Akshata    |pandhare |India     |Assam   | 123345 |Graduate/Post Graduate-Professional |Hell  |
      |shantanu    |sss@gmail.com   |Shantanu    |shinde   |India     |Delhi   |987654  |Vocational                          |why   |
      |ruhi        |ruhi@gmail.com  |Ruhi        |shinde   |India     |Bihar   | 345678 |Higher Secondary Education          | What |
      |vani        |vani@gmail.com  |Vani        |supane   |India     |Kerla   | 543789 |Secondary Education                 |Than  |