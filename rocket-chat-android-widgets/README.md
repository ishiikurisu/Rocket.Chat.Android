[README](../README.md) > rocket-chat-android-widgets

## Rocket Chat Android Widgets

### AvatarView

### FontAwesomeTextView / FontelloTextView

### WaitingView

### MessageView

````
**HELLO**, _Hello_, ~hogehoge~

> hoge

Hi, @YusukeIwaki,
````

passing the text above to `MessageView#setText()` method, it will be rendered as below:

![image](https://cloud.githubusercontent.com/assets/11763113/20179912/90bef7d8-a79b-11e6-97f3-20b49e207e91.png)


#### implementation

**implemented with Span**

* bold, italic (StyleSpan)
* URL link, mention (ClickableSpan)
* Quote (QuoteSpan)
* inline code ??

ref: https://guides.codepath.com/android/Working-with-the-TextView#using-spans-to-style-sections-of-text, http://flavienlaurent.com/blog/2014/01/31/spans/

 

**implemented by spliting view**

* multi-line code