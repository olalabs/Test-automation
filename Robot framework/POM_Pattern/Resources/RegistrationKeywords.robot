*** Settings ***
Library     SeleniumLibrary
Variables   ../PageObjects/Locators.py

*** Keywords ***
Open my Browser
    [Arguments]     ${siteUrl}  ${browser}
    open browser    ${siteUrl}  ${browser}
    maximize browser window

Click Register Link
    click link  ${link_Reg}

Enter FirstName
    [Arguments]     ${firstName}
    input text      ${txt_firstName}    ${firstName}

Enter LastName
    [Arguments]     ${lastName}
    input text      ${txt_lastName}     ${lastName}

Enter Phone
    [Arguments]     ${phone}
    Input text      ${txt_phone}        ${phone}

Enter Email
    [Arguments]     ${email}
    input text      ${txt_email}        ${email}

Enter Address1
    [Arguments]     ${address1}
    input text      ${txt_address1}     ${address1}

Enter Address2
    [Arguments]     ${address2}
    input text      ${txt_address2}     ${address2}

Enter City
    [Arguments]     ${city}
    input text      ${txt_city}         ${city}

Enter State
    [Arguments]     ${state}
    input text      ${txt_state}        ${state}

Enter Postal Code
    [Arguments]     ${postalCode}
    input text      ${txt_postalCode}   ${postalCode}

Select Country
    [Arguments]     ${country}
    select from list by label   ${drp_country}  ${country}

Enter Username
    [Arguments]     ${username}
    input text      ${txt_userName}     ${username}

Enter Password
    [Arguments]     ${regPassword}
    input text      ${txt_regPwd}     ${regPassword}

Enter Confirmed Password
    [Arguments]     ${confpwd}
    input text      ${txt_confirmPwd}     ${confPwd}

Click Submit
    click button    ${btn_submit}

Verify Succesful Registration
    page should contain     Thank you for registering.

Close my browsers
    close all browsers