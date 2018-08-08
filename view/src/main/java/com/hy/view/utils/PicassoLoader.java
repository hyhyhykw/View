package com.hy.view.utils;

import com.hy.library.Base;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Created time : 2018/8/8 16:00.
 *
 * @author HY
 */
public class PicassoLoader {
    public static RequestCreator load(String url) {
        if (!url.startsWith("http")) {
            url = Base.getDelegate().getBaseUrl() + url;
        }
        return Picasso.get().load(url);
    }
}
