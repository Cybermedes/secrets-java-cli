# Java Secrets CLI Tool

A simple Java command line (CLI) project using the JDK built-in *HTTP Client API* to make Http requests to
the Secrets API (https://secrets-api.appbrewery.com/) and retrieve the responses. This API basically allows
users to create, update, delete and read secrets anonymously, it also contains a basic authentication system
with username, password, API-key and token for some of its endpoints.

Some notes about this API:

- All submitted data are erased in a regular basis (your data may not be available after a couple of months)
- This API is for educational purposes, although it says "secrets" and requires "usernames", it's recommended
to avoid writing sensitive, private or real information ;)
- The username and password are set up only once, if you forget one of them, it's better to make a new one
- Token and API-key are also unique per user and only available when created, if you forget to copy or save it
somewhere, it's better to create another username with a password
- Two equal usernames are not allowed, it must be unique

## Secret structure

The API only works with JSON and each "secret" has the following structure:

```json
{
    "id": "random-id",
    "secret": "This is a random secret.",
    "emScore": 3,
    "username": "user123",
    "timestamp": "2022-10-01T12:34:56Z"
}
```

`emScore` stands for "embarrassment score", how much in scale from 1 to 10 are "embarrassed" for
"sharing your secret" XD. Again, don't take this too seriously.

## Http Methods

The *Http methods* made in this project are: `GET`, `POST`, `PUT`, `PATCH` and `DELETE`. 
