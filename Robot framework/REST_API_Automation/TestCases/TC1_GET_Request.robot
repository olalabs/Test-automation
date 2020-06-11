*** Settings ***
Library  RequestsLibrary
Library  Collections

*** Variables ***
${base_url}     http://restapi.demoqa.com
${city}     Paris

*** Test Cases ***
Get_WeatherInformation
    create session  mysession     ${base_url}
    ${response}=    get request  mysession  utilities/weather/city/${city}
    log to console  ${response.status_code}
    log to console  ${response.content}
    log to console  ${response.headers}

    #VALIDATIONS
    ${status_code}=  convert to string  ${response.status_code}     #convert int to string
    should be equal  ${status_code}     200

    ${body}=    convert to string   ${response.content}
    should contain  ${body}     Paris

    # get value of the key "Content-Type" from dictionary: response.headers
    ${contentTypeValue}=    get from dictionary  ${response.headers}     Content-Type
    should be equal   ${contentTypeValue}   application/json
