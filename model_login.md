[README](README.md) > model > login

## Models concerning login process

### MeteorLoginServiceConfiguration

just document object for DDP-subscription "meteor_accounts_loginServiceConfiguration".
note that the model is linked with ServerConfig.

### ServerConfig

each configuration of server (demo.rocket.chat, hogehoge.herokuapp.com, ...)

fields

* id ... random
* hostname
* token
* tokenVerified

### ServerConfigCredential

* id ... same as ServerConfig's if type=email; otherwise same as MeteorLoginServiceConfiguration's
* type ... email/twitter/github
