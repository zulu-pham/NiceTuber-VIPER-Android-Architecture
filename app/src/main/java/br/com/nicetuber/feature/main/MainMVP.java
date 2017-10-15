package br.com.nicetuber.feature.main;

import java.util.List;

import br.com.nicetuber.model.Channel;

/**
 * Created by thiagozg on 15/10/2017.
 */

public interface MainMVP {

    interface View {

    }

    interface Callback {
        void onSearchChannelSuccess(List<Channel> response);
        void onSearchChannelError(String message);
    }

}