package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
final class f extends c<String> {
    final /* synthetic */ Map b;

    f(Map map) {
        this.b = map;
    }

    /* renamed from: ۟۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3219(Object obj) {
        if (C0017.m3633() < 0) {
            ((c) obj).b();
        }
    }

    /* renamed from: ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3220(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Map m3221(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((Headers) obj).toMultimap();
        }
        return null;
    }

    /* renamed from: ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static Map m3222(Object obj) {
        if (C0031.m5628() > 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m3223(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m3224(Object obj) {
        if (C0029.m5282() >= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Headers m3225(Object obj) {
        if (C0058.m9131() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public final void onFailure(Call call, Exception exc) {
        m3219(this);
        m3224(exc);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map mapM3222 = m3222(this);
            if (mapM3222 != null) {
                C0004.m1548(mapM3222);
                C0051.m8198(m3222(this), m3221(m3225(response)));
            }
            return m3220(m3223(response));
        } catch (IOException unused) {
            return C0007.m1840();
        }
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}