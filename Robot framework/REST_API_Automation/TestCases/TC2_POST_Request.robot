*** Settings ***
Library  RequestsLibrary
Library  Collections

*** Variables ***
${base_url}=     http://restapi.demoqa.com/customer

*** Test Cases ***
Post_CustomerRegistration
    create session  mysession     ${base_url}
    ${body}=    create dictionary  FirstName=Suzzane365   LastName=Willis263   UserName=Suzi243   Password=OpenSesame264    Email=suzi354@gmail.com
    ${header}=  create dictionary  Content-Type=application/json    #key=value
    ${response}=    post request  mysession     /register   data=${body}    headers=${header}

    log to console  ${response.status_code}
    log to console  ${response.content}

    #VALIDATIONS
    ${status_code}=  convert to string  ${response.status_code}
    should be equal  ${status_code}     201

    ${resp_body}=   convert to string  ${response.content} #convert json format to string
    should contain  ${resp_body}     OPERATION_SUCCESS
    should contain  ${resp_body}     Operation completed successfully
