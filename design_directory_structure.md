[README](README.md) > design > directory structure

## Activity, Fragment, View

* app/src/main/java/chat/rocket/android/activity
* app/src/main/java/chat/rocket/android/fragment
* app/src/main/java/chat/rocket/android/view

don't include any helpers (such as ListAdapter, HogeHogeUtil, ...)

Widget components are not put in app/src/main/java/chat/rocket/android/view, but in [rocket-chat-android-widgets](rocket-chat-android-widgets/README.md) project!

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
* app/src/main/java/chat/rocket/android/service/ddp_subscription

NOTE that 

* observer concerns Realm model, such as "new Message is inserted"
* ddp_subscription is just subscriber, such as "user_settings", "stream_messages"