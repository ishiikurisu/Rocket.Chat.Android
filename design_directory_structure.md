[README](README.md) > design > directory structure

## Activity, Fragment, View

* app/src/main/java/chat/rocket/android/activity
* app/src/main/java/chat/rocket/android/fragment
* app/src/main/java/chat/rocket/android/view

don't include any helpers (such as ListAdapter, HogeHogeUtil, ...)


## layout helpers

* app/src/main/java/chat/rocket/android/layouthelper

to include ListAdapters, ViewHolders, and any other component classes used in specific Activitys or Fragments


## Models

* app/src/main/java/chat/rocket/android/model

just Realm models. don't include any util functions related to view rendering.

## Presenter

* app/src/main/java/chat/rocket/android/renderer

Util function classes for view rendering.


## background service

* app/src/main/java/chat/rocket/android/service
* app/src/main/java/chat/rocket/android/service/observer

