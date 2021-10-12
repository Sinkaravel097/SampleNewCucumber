#
#@Feature1 @Feature2
#Feature: To Validate Login Functionality Of Facebook Application
#
  #Background: 
    #Given User has to launch the chrome browser and hit the facebook url
#
#	@Smoke
  #Scenario: To Validate Login with Invalid Username and Valid Password
  #
    #When User has to pass the invalid username in email field
      #| email1 | java@gmail.com     |
      #| email2 | selenium@gmail.com |
      #| email3 | python@gmail.com   |
      #
    #And User has to pass the valid password in password field
      #| password1  | password2  | password3 |
      #|    3458765 | dfghkjh    | zxcvb765  |
      #| nbvx13     | 8765sdfgh  |     65432 |
      #| mnbvc12345 | 7654334567 | asdfgh987 |
      #
    #And User has to click the login button
    #And User has to navigate to the home page
   #
#	@Sanity @Regression
  #Scenario Outline: To validate positive and negative functionality of fb login
    #When To pass value in "<emailfield>" email field
    #And To pass value in "<passwordfield>" password field
    #When To click login button
    #
    #Examples: 
      #| emailfield          | passwordfield |
      #| java@gmail.com      | java123       |
      #| selenium@gmail.com  | selenium123   |
      #| python@gmail.com    | python123     |
      #| framework@gmail.com | framework123  |
