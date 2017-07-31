package chat.rocket.android.renderer;

import android.content.Context;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;

import chat.rocket.android.helper.Avatar;
import chat.rocket.android.helper.TextUtils;
import chat.rocket.android.widget.AbsoluteUrl;
import chat.rocket.core.models.User;
import chat.rocket.android.widget.RocketChatAvatar;

/**
 * Renderer for RealmUser model.
 */
public class UserRenderer extends AbstractRenderer<User> {

  public UserRenderer(Context context, User user) {
    super(context, user);
  }

  /**
   * show Avatar image
   */
  public UserRenderer avatarInto(RocketChatAvatar rocketChatAvatar, AbsoluteUrl absoluteUrl) {
    if (!shouldHandle(rocketChatAvatar)) {
      return this;
    }

    // @ishiikurisu: this `object` is the user. the absolute url is the chat url.
    // i think i need to create an url for the chat (if it doesn't exist) and show it with the relevant
    // users.
    if (!TextUtils.isEmpty(object.getUsername())) {
      rocketChatAvatar.setOnClickListener((view) -> {
        Toast.makeText(context, "URL: " + absoluteUrl.toString(), Toast.LENGTH_SHORT).show();
      });
      new Avatar(absoluteUrl, object.getUsername()).into(rocketChatAvatar);
    }
    return this;
  }

  /**
   * show Username in textView
   */
  public UserRenderer usernameInto(TextView textView) {
    if (!shouldHandle(textView)) {
      return this;
    }

    textView.setText(object.getUsername());

    return this;
  }

  /**
   * show user's status color into imageView.
   */
  public UserRenderer statusColorInto(ImageView imageView) {
    if (!shouldHandle(imageView)) {
      return this;
    }

    String status = object.getStatus();
    imageView.setImageResource(RocketChatUserStatusProvider.getInstance().getStatusResId(status));

    return this;
  }
}
