*** Settings ***
Library  SeleniumLibrary
Resource  ../Resources/RegistrationKeywords.robot

*** Variables ***
${browser}  chrome
${siteUrl}  http://newtours.demoaut.com
${user}     tutorial
${pwd}      tutorial

*** Test Cases ***
RegistrationTest
    Open my Browser     ${siteUrl}  ${browser}
    Click Register Link
    Enter FirstName     Robert
    Enter LastName      Watson
    Enter Phone         123456789
    Enter Email         robert@gmail.com
    Enter Address1      Lomas Del Sol
    Enter Address2      Curridabat
    Enter City          San Jose
    Enter State         Texas
    Enter Postal Code   TX 67021
    Select Country      COSTA RICA
    Enter Username      robwat
    Enter Password      openSesame
    Enter Confirmed Password    openSesame
    Click Submit
    sleep   3 seconds
    Verify Succesful Registration
    Close my browsers