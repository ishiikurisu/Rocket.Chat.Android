[README](README.md) > design > basic archtecture

## MVP-like archtecture.

* Model indicates everything (sync state, message text, ...) except for how it should be rendered.
* View(Activity, Fragment, View ...) basically doesn't know the connectivity or any API call, just knows how to render the Model.
* background service always observes the change of the model elements. It calls Web-API or make some websocket messaging for syncing models with server.

