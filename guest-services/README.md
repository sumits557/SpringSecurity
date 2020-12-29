# SpringSecurity
Spring Security concepts

- Guest service having guests details stored as static data.
- Created OAuth authorization and resource service.
- http --form POST localhost:8100/oauth/token Authorization:"Basic Z3Vlc3RfYXBwOnNlY3JldA==" grant_type=client_credentials  (will get the key value from http://tuxgraphics.org/toolbox/base64-javascript.html and provide the username:password = guest_app:secret and encode it)
- http --form POST localhost:8100/oauth/token Authorization:"Basic YXBpX2F1ZGl0OnNlY3JldA==" grant_type=client_credentials  (will get the key value from http://tuxgraphics.org/toolbox/base64-javascript.html and provide the username:password = api_audit:secret and encode it)