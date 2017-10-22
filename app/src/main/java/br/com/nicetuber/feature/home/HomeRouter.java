package br.com.nicetuber.feature.home;

import android.content.Context;
import android.content.Intent;

import org.parceler.Parcels;

import br.com.nicetuber.feature.channel_details.ChannelDetailsActivity;
import br.com.nicetuber.model.Channel;

import static br.com.nicetuber.util.ParamKey.KEY_CHANNEL;

/**
 * Created by thiagozg on 22/10/2017.
 */

public class HomeRouter {

    public static void goToChannelDetailsView(Context context, Channel channel) {
        Intent intent = new Intent(context, ChannelDetailsActivity.class);
        intent.putExtra(KEY_CHANNEL, Parcels.wrap(channel));
        context.startActivity(intent);
    }

}