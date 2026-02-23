package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.z.C0065;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class e implements CookieJar {
    e() {
    }

    /* renamed from: ۦۣۣ, reason: contains not printable characters */
    public static String m3218(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((HttpUrl) obj).host();
        }
        return null;
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> list = (List) C0065.m9715(C0034.m6017(), m3218(httpUrl));
        return list != null ? list : new ArrayList();
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        C0053.m8424(C0034.m6017(), m3218(httpUrl), list);
    }
}