
Feature: Test the requres website

Scenario: Test GET request

Given  User creates the request object "https://reqres.in/";

When   Users add the query parameter "page" and "2"

And    Users creates the response object "GET"

Then   User validate the responseCode 200
