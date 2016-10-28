[README](README.md) > design > policy

## MVP-like archtecture.

* Model indicates everything (sync state, message text, ...) except for how it should be rendered.
* View(Activity, Fragment, View ...) basically doesn't know the connectivity or any API call, just knows how to render the Model.
* background service always observes the change of the model elements. It calls Web-API or make some websocket messaging for syncing models with server.


## directory structure

### Activity, Fragment, View

* app/src/main/java/chat/rocket/android/activity
* app/src/main/java/chat/rocket/android/fragment
* app/src/main/java/chat/rocket/android/view

don't include any helpers (such as ListAdapter, HogeHogeUtil, ...)


### layout helpers

* app/src/main/java/chat/rocket/android/layouthelper

to include ListAdapters, ViewHolders, and any other component classes used in specific Activitys or Fragments


### Models

* app/src/main/java/chat/rocket/android/model

just Realm models. don't include any util functions related to view rendering.

### Presenter

* app/src/main/java/chat/rocket/android/renderer

Util function classes for view rendering.


### background service

* app/src/main/java/chat/rocket/android/service
* app/src/main/java/chat/rocket/android/service/observers

