*** Settings ***
Library  SeleniumLibrary
Variables   ../PageObjects/Locators.py

*** Keywords ***
Open my Browser
    [Arguments]     ${siteUrl}  ${browser}
    open browser    ${siteUrl}  ${browser}
    maximize browser window

Enter UserName
    [Arguments]     ${username}
    input text      ${txt_loginUserName}  ${username}

Enter Password
    [Arguments]     ${password}
    input text      ${txt_loginPassword}   ${password}

Click SignIn
    click button    ${btn_signIn}

Verify Successfull Login
    title should be  Find a Flight: Mercury Tours:

Close my browser
    close all browsers