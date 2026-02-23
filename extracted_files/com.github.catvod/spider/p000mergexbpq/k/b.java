package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public abstract class b extends c<String> {
    /* renamed from: ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3188(Object obj) {
        if (C0043.m7332() > 0) {
            ((c) obj).b();
        }
    }

    /* renamed from: ۟۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3189(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۡۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3190(Object obj, Object obj2, Object obj3) {
        if (C0008.m1975() > 0) {
            ((c) obj).onFailure((Call) obj2, (Exception) obj3);
        }
    }

    /* renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3191(Object obj, Object obj2, Object obj3) {
        if (C0058.m9131() < 0) {
            return ((b) obj).onParseResponse2((Call) obj2, (Response) obj3);
        }
        return null;
    }

    /* renamed from: ۣۥۢۧ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m3192(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public void onError(Call call, Exception exc) {
        m3188(this);
        m3190(this, call, exc);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public /* bridge */ /* synthetic */ String onParseResponse(Call call, Response response) {
        return m3191(this, call, response);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    /* renamed from: onParseResponse, reason: avoid collision after fix types in other method */
    public String onParseResponse2(Call call, Response response) {
        try {
            return m3189(m3192(response));
        } catch (IOException unused) {
            return C0007.m1840();
        }
    }
}