
Feature: Test the requres website

Scenario:  Test POST request

Given User create the request object "https://reqres.in/"

When User add the payload

And User creates the response Object "POST"

Then User validate ResponseCode
