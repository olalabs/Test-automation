*** Settings ***
Library  SeleniumLibrary
Resource  ../Resources/LoginKeywords.robot

*** Variables ***
${browser}  chrome
${siteUrl}  http://newtours.demoaut.com
${user}     tutorial
${pwd}      tutorial

*** Test Cases ***
LoginTest
    Open my Browser     ${siteUrl}  ${browser}
    Enter UserName      ${user}
    Enter Password      ${pwd}
    Click SignIn
    sleep   3 seconds
    Verify Successfull Login
    Close my browser