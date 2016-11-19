[README](README.md) > model > login

## Models concerning login process

### ServerConfig

each configuration of server (demo.rocket.chat, hogehoge.herokuapp.com, ...)

fields

* id ... random
* hostname
* status ... READY / CONNECTING / CONNECTED / ERROR

the status of ServerConfig is synced with the connectivity of RocketChatWebSocketThread.


### MeteorLoginServiceConfiguration

just document object for DDP-subscription "meteor_accounts_loginServiceConfiguration".
note that the model is linked with ServerConfig.

### Session

* id ... 0
* token
* tokenVerified

stores the authentication status.


## Note

ServerConfig is stored in `default.realm`, while other models are in `<server-config-id>.realm`